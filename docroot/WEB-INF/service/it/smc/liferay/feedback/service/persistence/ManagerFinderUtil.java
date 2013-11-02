/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.smc.liferay.feedback.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author dbg
 */
public class ManagerFinderUtil {
	public static int countByC_G_P_D_UM_S(long companyId, long groupId,
		long plid, java.lang.String description, long userManagerId,
		int status, boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_G_P_D_UM_S(companyId, groupId, plid, description,
			userManagerId, status, andOperator);
	}

	public static java.util.List<it.smc.liferay.feedback.model.Manager> findByC_G_P_D_UM_S(
		long companyId, long groupId, long plid, java.lang.String description,
		long userManagerId, int status, boolean andOperator, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_G_P_D_UM_S(companyId, groupId, plid, description,
			userManagerId, status, andOperator, start, end, obc);
	}

	public static ManagerFinder getFinder() {
		if (_finder == null) {
			_finder = (ManagerFinder)PortletBeanLocatorUtil.locate(it.smc.liferay.feedback.service.ClpSerializer.getServletContextName(),
					ManagerFinder.class.getName());

			ReferenceRegistry.registerReference(ManagerFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ManagerFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ManagerFinderUtil.class, "_finder");
	}

	private static ManagerFinder _finder;
}