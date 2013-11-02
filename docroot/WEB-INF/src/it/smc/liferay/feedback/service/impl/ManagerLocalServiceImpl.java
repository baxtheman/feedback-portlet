
package it.smc.liferay.feedback.service.impl;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.base.ManagerLocalServiceBaseImpl;
import it.smc.liferay.feedback.util.FeedbackConstants;
import it.smc.liferay.feedback.util.PortletKeys;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.portlet.PortletPreferences;

/**
 * @author dbg
 */
public class ManagerLocalServiceImpl extends ManagerLocalServiceBaseImpl {

	public Manager addManager(
		long userId, long plid, String description,
		String url, String userAgent,
		String filename, InputStream inputStream,
		long userManagerId, int status, Date statusDate,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		// Manager

		User user = userPersistence.findByPrimaryKey(userId);
		long companyId = serviceContext.getCompanyId();
		long groupId = serviceContext.getScopeGroupId();
		Date now = new Date();

		long managerId =
			counterLocalService.increment(FeedbackConstants.COUNTER);

		Manager manager = managerPersistence.create(managerId);

		manager.setGroupId(groupId);
		manager.setCompanyId(user.getCompanyId());
		manager.setUserId(userId);
		manager.setUserName(user.getFullName());
		manager.setCreateDate(serviceContext.getCreateDate(now));
		manager.setModifiedDate(serviceContext.getModifiedDate(now));

		manager.setPlid(plid);
		manager.setDescription(description);
		manager.setFile(null);
		manager.setUrl(url);
		manager.setUserAgent(userAgent);

		manager.setUserManagerId(userManagerId);
		manager.setStatus(status);
		manager.setStatusDate(statusDate);

		managerPersistence.update(manager, false);

		// Save File

		if (inputStream != null) {

			_savefile(inputStream, filename, companyId, manager);
		}

		// Send email

		try {
			_sendNotifications(manager);
		}
		catch (Exception e) {
			_log.error(e);
		}

		return manager;
	}

	public void deleteGroupEntries(long groupId)
		throws PortalException, SystemException {

		for (Manager entry : managerPersistence.findByGroupId(groupId)) {
			deleteManager(entry);
		}
	}

	public Manager deleteManager(long managerId)
		throws PortalException, SystemException {

		Manager manager = managerPersistence.findByPrimaryKey(managerId);

		return deleteManager(manager);
	}

	public Manager deleteManager(Manager manager)
		throws PortalException, SystemException {

		// Entry

		managerPersistence.remove(manager);

		// File

		if (DLStoreUtil.hasFile(
			manager.getCompanyId(), CompanyConstants.SYSTEM, manager.getFile())) {

			DLStoreUtil.deleteFile(
				manager.getCompanyId(), CompanyConstants.SYSTEM,
				manager.getFile());
		}

		return manager;
	}

	public Manager updateManager(
		long managerId, long plid, String description,
		long userManagerId, int status,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		// Manager

		Manager manager = managerPersistence.findByPrimaryKey(managerId);

		manager.setModifiedDate(serviceContext.getCreateDate(null));

		manager.setPlid(plid);
		manager.setDescription(description);
		manager.setUserManagerId(userManagerId);
		manager.setStatus(status);

		manager = managerPersistence.update(manager, false);

		return manager;
	}

	public List<Manager> getCompanyEntries(
		long companyId, int start, int end, OrderByComparator obc)
		throws SystemException {

		return managerPersistence.findByCompanyId(companyId, start, end, obc);
	}

	public List<Manager> getCompanyEntries(long companyId, int start, int end)
		throws SystemException {

		return managerPersistence.findByCompanyId(companyId, start, end);
	}

	public int getCompanyEntriesCount(long companyId)
		throws SystemException {

		return managerPersistence.countByCompanyId(companyId);
	}

	public List<Manager> getGroupEntries(long groupId, int start, int end)
		throws SystemException {

		return managerPersistence.findByGroupId(groupId, start, end);
	}

	public int getGroupEntriesCount(long groupId)
		throws SystemException {

		int count = managerPersistence.countByGroupId(groupId);
		return count;
	}

	public List<Manager> getByG_U(long groupId, long userId)
		throws SystemException {

		return managerPersistence.findByU_G(userId, groupId);
	}

	public int countByG_U(long groupId, long userId)
		throws SystemException {

		int count = managerPersistence.countByU_G(userId, groupId);

		return count;
	}

	public int searchCount(
		long companyId, long groupId, long plid, String description,
		long userManagerId, int status, boolean andOperator)
		throws SystemException {

		return managerFinder.countByC_G_P_D_UM_S(
			companyId, groupId, plid, description, userManagerId, status,
			andOperator);
	}

	public List<Manager> search(
		long companyId, long groupId, long plid, String description,
		long userManagerId, int status, boolean andOperator, int start,
		int end, OrderByComparator obc)
		throws SystemException {

		return managerFinder.findByC_G_P_D_UM_S(
			companyId, groupId, plid, description, userManagerId, status,
			andOperator, start, end, obc);
	}

	private void _savefile(
		InputStream inputStream, String filename, long companyId, Manager manager)
		throws PortalException, SystemException {

		if (!DLStoreUtil.hasDirectory(
			companyId, CompanyConstants.SYSTEM,
			FeedbackConstants.FILE_DIR_NAME)) {

			DLStoreUtil.addDirectory(
				companyId, CompanyConstants.SYSTEM,
				FeedbackConstants.FILE_DIR_NAME);
		}

		Calendar cd = Calendar.getInstance();
		cd.setTime(manager.getCreateDate());

		filename =
			FeedbackConstants.FILE_DIR_NAME +
				StringPool.SLASH +
				String.format(
					"%s-%s-", manager.getUserId(), cd.getTimeInMillis()) +
				filename;

		if (DLStoreUtil.hasFile(companyId, CompanyConstants.SYSTEM, filename)) {

			DLStoreUtil.deleteFile(companyId, CompanyConstants.SYSTEM, filename);
		}

		DLStoreUtil.addFile(
			companyId, CompanyConstants.SYSTEM,
			filename, inputStream);

		manager.setFile(filename);
		managerPersistence.update(manager, false);
	}

	private void _sendNotifications(Manager manager)
		throws SystemException, PortalException, UnsupportedEncodingException {

		long ownerId = manager.getGroupId();
		int ownerType = PortletKeys.PREFS_OWNER_TYPE_GROUP;
		long plid = PortletKeys.PREFS_PLID_SHARED;
		String portletId = PortletKeys.MANAGER_PORTLET;

		PortletPreferences preferences =
			PortletPreferencesLocalServiceUtil.getPreferences(
				manager.getCompanyId(), ownerId, ownerType, plid, portletId);

		User user = UserLocalServiceUtil.getUser(manager.getUserId());
		Group group = GroupLocalServiceUtil.getGroup(manager.getGroupId());

		InternetAddress from =
			new InternetAddress(user.getEmailAddress(), user.getFullName());

		String[] emails =
			StringUtil.split(GetterUtil.getString(preferences.getValue(
				"emailNotificationList", "")), StringPool.NEW_LINE);

		String subject =
			GetterUtil.getString(preferences.getValue(
				"emailSubject",
				"[Feedback for Liferay site] " + group.getName()));

		StringBundler sb = new StringBundler();

		sb.append("site: " + group.getName());
		sb.append(StringPool.NEW_LINE);
		sb.append("user: " + user.getFullName());
		sb.append(StringPool.NEW_LINE);
		sb.append("feedback: " + manager.getDescription());
		sb.append(StringPool.NEW_LINE);
		sb.append("page url: " + manager.getUrl());
		sb.append(StringPool.NEW_LINE);

		String body = sb.toString();

		for (String email : emails) {

			if (!Validator.isEmailAddress(email))
				continue;

			InternetAddress to = new InternetAddress(email, email);

			MailMessage message =
				new MailMessage(from, to, subject, body, false);

			MailServiceUtil.sendEmail(message);
		}

		// send to sender

		if (emails.length > 0) {

			InternetAddress to =
				new InternetAddress(user.getEmailAddress(), user.getFullName());

			body = "Thank you for your feedback." +
					StringPool.NEW_LINE +
					"-----" +
					StringPool.NEW_LINE + StringPool.NEW_LINE + body;

			MailMessage message =
				new MailMessage(from, to, subject, body, false);

			MailServiceUtil.sendEmail(message);
		}
	}

	private static Log _log =
		LogFactoryUtil.getLog(ManagerLocalServiceImpl.class);
}
