
package it.smc.liferay.feedback.manager.search;

import com.liferay.portal.kernel.dao.search.DAOParamUtil;

import javax.portlet.PortletRequest;

/**
 * @author dbg
 */
public class ManagerSearchTerms extends ManagerDisplayTerms {


	public ManagerSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);

		plid = DAOParamUtil.getLong(portletRequest, PLID);
		description = DAOParamUtil.getLike(portletRequest, DESCRIPTION);
		userManagerId = DAOParamUtil.getLong(portletRequest, USERMANAGERID);
		status = DAOParamUtil.getInteger(portletRequest, STATUS);

	}

}
