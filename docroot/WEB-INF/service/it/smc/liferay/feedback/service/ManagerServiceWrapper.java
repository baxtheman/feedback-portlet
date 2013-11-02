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

package it.smc.liferay.feedback.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ManagerService}.
 * </p>
 *
 * @author    dbg
 * @see       ManagerService
 * @generated
 */
public class ManagerServiceWrapper implements ManagerService,
	ServiceWrapper<ManagerService> {
	public ManagerServiceWrapper(ManagerService managerService) {
		_managerService = managerService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _managerService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_managerService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _managerService.invokeMethod(name, parameterTypes, arguments);
	}

	public it.smc.liferay.feedback.model.Manager addManager(long userId,
		long groupId, long plid, java.lang.String description,
		java.lang.String url, java.lang.String userAgent,
		java.lang.String shortFileName, java.io.InputStream inputStream,
		long userManagerId, int status, java.util.Date statusDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.addManager(userId, groupId, plid, description,
			url, userAgent, shortFileName, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	public void deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_managerService.deleteManager(managerId);
	}

	public it.smc.liferay.feedback.model.Manager updateManager(long managerId,
		long plid, java.lang.String description, long userManagerId,
		int status, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.updateManager(managerId, plid, description,
			userManagerId, status, serviceContext);
	}

	public it.smc.liferay.feedback.model.Manager getManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getManager(managerId);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getGroupEntries(groupId, start, end);
	}

	public int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerService.getGroupEntriesCount(groupId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ManagerService getWrappedManagerService() {
		return _managerService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedManagerService(ManagerService managerService) {
		_managerService = managerService;
	}

	public ManagerService getWrappedService() {
		return _managerService;
	}

	public void setWrappedService(ManagerService managerService) {
		_managerService = managerService;
	}

	private ManagerService _managerService;
}