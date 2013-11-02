

package it.smc.liferay.feedback.util;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.util.portlet.PortletProps;

public class PortletPropsValues {

	public static final String INTERVENTI_MAIN_LANGUAGE = GetterUtil.getString(
		PortletProps.get(PortletPropsKeys.INTERVENTI_MAIN_LANGUAGE), "it_IT");

}
