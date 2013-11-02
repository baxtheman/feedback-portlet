
package it.smc.liferay.feedback.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import it.smc.liferay.feedback.NoSuchManagerException;
import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;
import it.smc.liferay.feedback.service.base.ManagerServiceBaseImpl;
import it.smc.liferay.feedback.service.permission.ManagerPermission;
import it.smc.liferay.feedback.service.permission.ManagerEntryPermission;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author dbg
 */
public class ManagerServiceImpl extends ManagerServiceBaseImpl {

	public Manager addManager(
		long userId, long groupId, long plid, String description,
		String url, String userAgent,
		String shortFileName, InputStream inputStream, long userManagerId,
		int status, Date statusDate, ServiceContext serviceContext)
		throws PortalException, SystemException {

		// ManagerPermission.check(
		// getPermissionChecker(), groupId, ActionKeys.ADD_MANAGER);

		return managerLocalService.addManager(
			userId, plid, description, url, userAgent, shortFileName,
			inputStream, userManagerId, status, statusDate, serviceContext);
	}

	public void deleteManager(long managerId)
		throws PortalException, SystemException {

		// ManagerPermission.check(
		// getPermissionChecker(), managerId, ActionKeys.DELETE);

		managerLocalService.deleteManager(managerId);
	}

	public Manager updateManager(
		long managerId, long plid, String description,
		long userManagerId, int status,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		// ManagerPermission.check(
		// getPermissionChecker(), managerId, ActionKeys.UPDATE);

		return managerLocalService.updateManager(
			managerId, plid, description, userManagerId, status,
			serviceContext);
	}

	public Manager getManager(long managerId)
		throws PortalException, SystemException {

		Manager manager = managerLocalService.getManager(managerId);

		// ManagerEntryPermission.check(
		// getPermissionChecker(), manager, ActionKeys.VIEW);

		return manager;
	}

	public List<Manager> getGroupEntries(long groupId, int start, int end)
		throws SystemException {

		return managerLocalService.getGroupEntries(groupId, start, end);
	}

	public int getGroupEntriesCount(long groupId)
		throws SystemException {

		int count = managerLocalService.getGroupEntriesCount(groupId);

		return count;
	}
}
