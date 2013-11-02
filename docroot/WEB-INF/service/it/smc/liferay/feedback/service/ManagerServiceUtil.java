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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the manager remote service. This utility wraps {@link it.smc.liferay.feedback.service.impl.ManagerServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author dbg
 * @see ManagerService
 * @see it.smc.liferay.feedback.service.base.ManagerServiceBaseImpl
 * @see it.smc.liferay.feedback.service.impl.ManagerServiceImpl
 * @generated
 */
public class ManagerServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.smc.liferay.feedback.service.impl.ManagerServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static it.smc.liferay.feedback.model.Manager addManager(
		long userId, long groupId, long plid, java.lang.String description,
		java.lang.String url, java.lang.String userAgent,
		java.lang.String shortFileName, java.io.InputStream inputStream,
		long userManagerId, int status, java.util.Date statusDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addManager(userId, groupId, plid, description, url,
			userAgent, shortFileName, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	public static void deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteManager(managerId);
	}

	public static it.smc.liferay.feedback.model.Manager updateManager(
		long managerId, long plid, java.lang.String description,
		long userManagerId, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateManager(managerId, plid, description, userManagerId,
			status, serviceContext);
	}

	public static it.smc.liferay.feedback.model.Manager getManager(
		long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getManager(managerId);
	}

	public static java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupEntries(groupId, start, end);
	}

	public static int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGroupEntriesCount(groupId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ManagerService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ManagerService.class.getName());

			if (invokableService instanceof ManagerService) {
				_service = (ManagerService)invokableService;
			}
			else {
				_service = new ManagerServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ManagerServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ManagerService service) {
	}

	private static ManagerService _service;
}