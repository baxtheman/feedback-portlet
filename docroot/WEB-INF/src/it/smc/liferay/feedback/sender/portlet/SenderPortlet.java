
package it.smc.liferay.feedback.sender.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Daniele Baggio
 */
public class SenderPortlet extends MVCPortlet {


	public void sendFeedback(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			Manager.class.getName(), actionRequest);

		long userId = serviceContext.getGuestOrUserId();
		long plid = serviceContext.getPlid();

		String description = ParamUtil.getString(actionRequest, "description");
		String image = ParamUtil.getString(actionRequest, "image", null);
		String url = ParamUtil.getString(actionRequest, "url", null);

		HttpServletRequest httpRequest =
			PortalUtil.getHttpServletRequest(actionRequest);
		String userAgent = getUserAgent(httpRequest);

		String filename = StringPool.BLANK;
		InputStream in = null;

		if (image != null) {

			if (image.startsWith(IMAGE_PNG_HEADER)) {

				filename = "feedback.png";
				image = image.substring(IMAGE_PNG_HEADER.length());
			}

			_log.debug("image: " + image.substring(0, 50));

			byte[] imageBytes = Base64.decode(image);
			in = new ByteArrayInputStream(imageBytes);
		}

		ManagerLocalServiceUtil.addManager(
			userId, plid, description, url, userAgent, filename, in, 0, 0,
			null, serviceContext);
	}

	protected String getUserAgent(HttpServletRequest request) {
		String userAgent = StringPool.BLANK;

		if (request != null) {
			userAgent = (String)request.getAttribute(HttpHeaders.USER_AGENT);

			if (userAgent == null) {
				String userAgentHeader = request.getHeader(
					HttpHeaders.USER_AGENT);

				if (userAgentHeader != null) {
					userAgent = userAgentHeader.toLowerCase();
				}
				else {
					userAgent = StringPool.BLANK;
				}

				request.setAttribute(HttpHeaders.USER_AGENT, userAgent);
			}
		}

		return userAgent;
	}

	private static final String IMAGE_PNG_HEADER="data:image/png;base64,";

	private static Log _log = LogFactoryUtil.getLog(SenderPortlet.class);
}
