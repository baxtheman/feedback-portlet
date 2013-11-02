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
 * This class is a wrapper for {@link ManagerLocalService}.
 * </p>
 *
 * @author    dbg
 * @see       ManagerLocalService
 * @generated
 */
public class ManagerLocalServiceWrapper implements ManagerLocalService,
	ServiceWrapper<ManagerLocalService> {
	public ManagerLocalServiceWrapper(ManagerLocalService managerLocalService) {
		_managerLocalService = managerLocalService;
	}

	/**
	* Adds the manager to the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was added
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager addManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.addManager(manager);
	}

	/**
	* Creates a new manager with the primary key. Does not add the manager to the database.
	*
	* @param managerId the primary key for the new manager
	* @return the new manager
	*/
	public it.smc.liferay.feedback.model.Manager createManager(long managerId) {
		return _managerLocalService.createManager(managerId);
	}

	/**
	* Deletes the manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param managerId the primary key of the manager
	* @return the manager that was removed
	* @throws PortalException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager deleteManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.deleteManager(managerId);
	}

	/**
	* Deletes the manager from the database. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was removed
	* @throws PortalException
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager deleteManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.deleteManager(manager);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _managerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.dynamicQueryCount(dynamicQuery);
	}

	public it.smc.liferay.feedback.model.Manager fetchManager(long managerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.fetchManager(managerId);
	}

	/**
	* Returns the manager with the primary key.
	*
	* @param managerId the primary key of the manager
	* @return the manager
	* @throws PortalException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager getManager(long managerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getManager(managerId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<it.smc.liferay.feedback.model.Manager> getManagers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getManagers(start, end);
	}

	/**
	* Returns the number of managers.
	*
	* @return the number of managers
	* @throws SystemException if a system exception occurred
	*/
	public int getManagersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getManagersCount();
	}

	/**
	* Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @return the manager that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager updateManager(
		it.smc.liferay.feedback.model.Manager manager)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.updateManager(manager);
	}

	/**
	* Updates the manager in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param manager the manager
	* @param merge whether to merge the manager with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the manager that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager updateManager(
		it.smc.liferay.feedback.model.Manager manager, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.updateManager(manager, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _managerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_managerLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _managerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public it.smc.liferay.feedback.model.Manager addManager(long userId,
		long plid, java.lang.String description, java.lang.String url,
		java.lang.String userAgent, java.lang.String filename,
		java.io.InputStream inputStream, long userManagerId, int status,
		java.util.Date statusDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.addManager(userId, plid, description, url,
			userAgent, filename, inputStream, userManagerId, status,
			statusDate, serviceContext);
	}

	public void deleteGroupEntries(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_managerLocalService.deleteGroupEntries(groupId);
	}

	public it.smc.liferay.feedback.model.Manager updateManager(long managerId,
		long plid, java.lang.String description, long userManagerId,
		int status, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.updateManager(managerId, plid, description,
			userManagerId, status, serviceContext);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntries(companyId, start, end, obc);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> getCompanyEntries(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntries(companyId, start, end);
	}

	public int getCompanyEntriesCount(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getCompanyEntriesCount(companyId);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> getGroupEntries(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getGroupEntries(groupId, start, end);
	}

	public int getGroupEntriesCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getGroupEntriesCount(groupId);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> getByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.getByG_U(groupId, userId);
	}

	public int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.countByG_U(groupId, userId);
	}

	public int searchCount(long companyId, long groupId, long plid,
		java.lang.String description, long userManagerId, int status,
		boolean andOperator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.searchCount(companyId, groupId, plid,
			description, userManagerId, status, andOperator);
	}

	public java.util.List<it.smc.liferay.feedback.model.Manager> search(
		long companyId, long groupId, long plid, java.lang.String description,
		long userManagerId, int status, boolean andOperator, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _managerLocalService.search(companyId, groupId, plid,
			description, userManagerId, status, andOperator, start, end, obc);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ManagerLocalService getWrappedManagerLocalService() {
		return _managerLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedManagerLocalService(
		ManagerLocalService managerLocalService) {
		_managerLocalService = managerLocalService;
	}

	public ManagerLocalService getWrappedService() {
		return _managerLocalService;
	}

	public void setWrappedService(ManagerLocalService managerLocalService) {
		_managerLocalService = managerLocalService;
	}

	private ManagerLocalService _managerLocalService;
}