
package it.smc.liferay.feedback.manager.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.smc.liferay.feedback.ManagerException;
import it.smc.liferay.feedback.NoSuchManagerException;
import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;
import it.smc.liferay.feedback.util.WebKeys;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

/**
 * @author dbg
 */
public class ManagerPortlet extends MVCPortlet {

	public void deleteManager(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		long managerId = ParamUtil.getLong(actionRequest, "managerId");

		if (cmd.equals(Constants.DELETE)) {
			ManagerLocalServiceUtil.deleteManager(managerId);
		}
	}

	public void updateManager(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) actionRequest.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);

		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();

		long managerId = ParamUtil.getLong(actionRequest, "managerId");

		long plid = ParamUtil.getLong(actionRequest, "plid");
		String description = ParamUtil.getString(actionRequest, "description");
		long userManagerId = ParamUtil.getLong(actionRequest, "userManagerId");
		int status = ParamUtil.getInteger(actionRequest, "status");

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(
				Manager.class.getName(), actionRequest);

		if (cmd.equals(Constants.UPDATE)) {

			ManagerLocalServiceUtil.updateManager(
				managerId, plid, description, userManagerId,
				status, serviceContext);
		}
	}

	public void processAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		super.processAction(actionRequest, actionResponse);

		if (!copyRequestParameters && !SessionErrors.isEmpty(actionRequest)) {
			PortalUtil.copyRequestParameters(actionRequest, actionResponse);
		}
	}

	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException, IOException {

		try {
			Manager manager = null;

			long managerId = ParamUtil.getLong(renderRequest, "managerId");

			if (managerId > 0) {
				manager = ManagerLocalServiceUtil.getManager(managerId);
			}

			renderRequest.setAttribute(WebKeys.MANAGER, manager);
		}
		catch (Exception e) {
			if (e instanceof ManagerException ||
				e instanceof NoSuchManagerException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass().getName());
			}
			else {
				throw new PortletException(e);
			}
		}

		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {

		try {
			String resourceID = resourceRequest.getResourceID();

			if (resourceID.equals("image")) {
				serveImage(resourceRequest, resourceResponse);
			}
		}
		catch (IOException ioe) {
			throw ioe;
		}
		catch (PortletException pe) {
			throw pe;
		}
		catch (Exception e) {
			throw new PortletException(e);
		}
	}

	public void serveImage(
		ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws Exception {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) resourceRequest.getAttribute(
				com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);

		long managerId = ParamUtil.getLong(resourceRequest, "managerId");

		Manager manager = ManagerLocalServiceUtil.getManager(managerId);

		InputStream in =
			DLStoreUtil.getFileAsStream(
				themeDisplay.getCompanyId(), CompanyConstants.SYSTEM,
				manager.getFile());

		PortletResponseUtil.sendFile(
			resourceRequest, resourceResponse, manager.getFile(), in);

	}

	private static Log _log = LogFactoryUtil.getLog(ManagerPortlet.class);

}
