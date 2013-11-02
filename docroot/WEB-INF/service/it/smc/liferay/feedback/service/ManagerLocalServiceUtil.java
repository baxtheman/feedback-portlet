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
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the manager local service. This utility wraps {@link it.smc.liferay.feedback.service.impl.ManagerLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author dbg
 * @see ManagerLocalService
 * @see it.smc.liferay.feedback.service.base.ManagerLocalServiceBaseImpl
 * @see it.smc.liferay.feedback.service.impl.ManagerLocalServiceImpl
 * @generated
 */
public class ManagerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link it.smc.liferay.feedback.service.impl.ManagerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the manager to the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was added
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager addManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addManager(manager);
	}

	/**
	* Creates a new manager with the primary key. Does not add the manager to the database.
	*
	* @param managerId the primary key for the new manager
	* @return the new manager
	*/
	public static it.smc.liferay.feedback.model.Manager createManager(
		long managerId) {
		return getService().createManager(managerId);
	}

	/**
	* Deletes the manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param managerId the primary key of the manager
	* @return the manager that was removed
	* @throws PortalException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager deleteManager(
		long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteManager(managerId);
	}

	/**
	* Deletes the manager from the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager deleteManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteManager(manager);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static it.smc.liferay.feedback.model.Manager fetchManager(
		long managerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchManager(managerId);
	}

	/**
	* Returns the manager with the primary key.
	*
	* @param managerId the primary key of the manager
	* @return the manager
	* @throws PortalException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager getManager(
		long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getManager(managerId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of managers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.smc.liferay.feedback.model.Manager> getManagers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManagers(start, end);
	}

	/**
	* Returns the number of managers.
	*
	* @return the number of managers
	* @throws SystemException if a system exception occurred
	*/
	public static int getManagersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getManagersCount();
	}

	/**
	* Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager updateManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateManager(manager);
	}

	/**
	* Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @param merge whether to merge the manager with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the manager that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static it.smc.liferay.feedback.model.Manager updateManager(
		it.smc.liferay.feedback.model.Manager manager, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateManager(manager, merge);
	}

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
		long userId, long plid, java.lang.String description,
		java.lang.String url, java.lang.String userAgent,
		java.lang.String filename, java.io.InputStream inputStream,
		long userManagerId, int status, java.util.Date statusDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addManager(userId, plid, description, url, userAgent,
			filename, inputStream, userManagerId, status, statusDate,
			serviceContext);
	}

	public static void deleteGroupEntries(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteGroupEntries(groupId);
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

	public static java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyEntries(companyId, start, end, obc);
	}

	public static java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyEntries(companyId, start, end);
	}

	public static int getCompanyEntriesCount(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCompanyEntriesCount(companyId);
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

	public static java.util.List<it.smc.liferay.feedback.model.Manager> getByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_U(groupId, userId);
	}

	public static int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_U(groupId, userId);
	}

	public static int searchCount(long companyId, long groupId, long plid,
		java.lang.String description, long userManagerId, int status,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .searchCount(companyId, groupId, plid, description,
			userManagerId, status, andOperator);
	}

	public static java.util.List<it.smc.liferay.feedback.model.Manager> search(
		long companyId, long groupId, long plid, java.lang.String description,
		long userManagerId, int status, boolean andOperator, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, groupId, plid, description,
			userManagerId, status, andOperator, start, end, obc);
	}

	public static void clearService() {
		_service = null;
	}

	public static ManagerLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ManagerLocalService.class.getName());

			if (invokableLocalService instanceof ManagerLocalService) {
				_service = (ManagerLocalService)invokableLocalService;
			}
			else {
				_service = new ManagerLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ManagerLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ManagerLocalService service) {
	}

	private static ManagerLocalService _service;
}