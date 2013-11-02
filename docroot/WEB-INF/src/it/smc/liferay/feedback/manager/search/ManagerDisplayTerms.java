

package it.smc.liferay.feedback.manager.search;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletRequest;

/**
 *	@author dbg
 */
public class ManagerDisplayTerms extends DisplayTerms {

	public static final String PLID = "plid";
	public static final String DESCRIPTION = "description";
	public static final String USERMANAGERID = "userManagerId";
	public static final String STATUS = "status";

	public ManagerDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		plid = ParamUtil.getLong(portletRequest, PLID);
		description = ParamUtil.getString(portletRequest, DESCRIPTION);
		userManagerId = ParamUtil.getLong(portletRequest, USERMANAGERID);
		status = ParamUtil.getInteger(portletRequest, STATUS);

	}

	public Long getPlid() {
		return plid;
	}

	public String getDescription() {
		return description;
	}

	public Long getUserManagerId() {
		return userManagerId;
	}

	public Integer getStatus() {
		return status;
	}


	protected long plid;
	protected String description;
	protected long userManagerId;
	protected int status;

}
