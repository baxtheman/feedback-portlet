
package it.smc.liferay.feedback.manager.search;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.PortalPreferences;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.util.comparator.ManagerComparator;
import it.smc.liferay.feedback.util.PortletKeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

/**
 * @author dbg
 */
public class ManagerSearch extends SearchContainer<Manager> {
	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	public static final String EMPTY_RESULTS_MESSAGE = "no-manager-were-found";

	static {
		headerNames.add("plid");
		headerNames.add("description");
		headerNames.add("fileEntryId");
		headerNames.add("userManagerId");
		headerNames.add("status");
		headerNames.add("statusDate");
		orderableHeaders.put("plid","plid");
		orderableHeaders.put("description","description");
		orderableHeaders.put("fileEntryId","fileEntryId");
		orderableHeaders.put("userManagerId","userManagerId");
		orderableHeaders.put("status","status");
		orderableHeaders.put("statusDate","statusDate");
	}

	public ManagerSearch(
			PortletRequest portletRequest, PortletURL iteratorURL) {

		super(
			portletRequest, new ManagerDisplayTerms(portletRequest),
				new ManagerSearchTerms(portletRequest),
				DEFAULT_CUR_PARAM, DEFAULT_DELTA, iteratorURL, headerNames,
				EMPTY_RESULTS_MESSAGE);

		ManagerDisplayTerms displayTerms =
			(ManagerDisplayTerms)getDisplayTerms();

		iteratorURL.setParameter(
			ManagerDisplayTerms.PLID,
			String.valueOf(displayTerms.getPlid()));

		iteratorURL.setParameter(
			ManagerDisplayTerms.DESCRIPTION,
			String.valueOf(displayTerms.getDescription()));

		iteratorURL.setParameter(
			ManagerDisplayTerms.USERMANAGERID,
			String.valueOf(displayTerms.getUserManagerId()));

		iteratorURL.setParameter(
			ManagerDisplayTerms.STATUS,
			String.valueOf(displayTerms.getStatus()));

		try {
			PortalPreferences preferences =
				PortletPreferencesFactoryUtil.getPortalPreferences(
					portletRequest);

			String orderByCol = ParamUtil.getString(
				portletRequest, "orderByCol");
			String orderByType = ParamUtil.getString(
				portletRequest, "orderByType");

			if (Validator.isNotNull(orderByCol) &&
				Validator.isNotNull(orderByType)) {

				preferences.setValue(
					PortletKeys.MANAGER_PORTLET,
					"users-order-by-col",orderByCol);
				preferences.setValue(
					PortletKeys.MANAGER_PORTLET,
					"users-order-by-type",orderByType);
			}
			else {
				orderByCol = preferences.getValue(
					PortletKeys.MANAGER_PORTLET,
					"managers-by-col","");
				orderByType = preferences.getValue(
					PortletKeys.MANAGER_PORTLET,
					"managers-by-type", "asc");
			}

			OrderByComparator orderByComparator =
				ManagerComparator.getManagerOrderByComparator(
					orderByCol, orderByType);

			setOrderableHeaders(orderableHeaders);
			setOrderByCol(orderByCol);
			setOrderByType(orderByType);
			setOrderByComparator(orderByComparator);
		}
		catch (Exception e) {
			_log.error(e);
		}

	}

	private Log _log = LogFactoryUtil.getLog(ManagerSearch.class);
}
