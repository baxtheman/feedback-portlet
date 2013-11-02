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

package it.smc.liferay.feedback.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Layout;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

import java.util.Locale;

/**
 * The extended model implementation for the Manager service. Represents a row
 * in the &quot;feedback_Manager&quot; database table, with each column mapped
 * to a property of this class. <p> Helper methods and all application logic
 * should be put in this class. Whenever methods are added, rerun ServiceBuilder
 * to copy their definitions into the
 * {@link it.smc.liferay.feedback.model.Manager} interface. </p>
 *
 * @author dbg
 */
public class ManagerImpl extends ManagerBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS: Never reference this class directly. All methods
	 * that expect a manager model instance should use the {@link
	 * it.smc.liferay.feedback.model.Manager} interface instead.
	 */
	public ManagerImpl() {

	}

	public String getPlidDescription()
		throws PortalException, SystemException {

		Layout layout = LayoutLocalServiceUtil.getLayout(getPlid());

		return String.format(
			"%s (%s)", layout.getName(Locale.getDefault(),true),
			layout.getFriendlyURL());
	}

	public String getPlidUrl()
		throws PortalException, SystemException {

		Layout layout = LayoutLocalServiceUtil.getLayout(getPlid());

		return PortalUtil.getLayoutActualURL(layout);
	}

	public String getUserFullName()
		throws PortalException, SystemException {

		return UserLocalServiceUtil.getUser(getUserId()).getFullName();
	}



}
