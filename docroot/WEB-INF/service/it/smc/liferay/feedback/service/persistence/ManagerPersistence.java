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

import com.liferay.portal.service.persistence.BasePersistence;

import it.smc.liferay.feedback.model.Manager;

/**
 * The persistence interface for the manager service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dbg
 * @see ManagerPersistenceImpl
 * @see ManagerUtil
 * @generated
 */
public interface ManagerPersistence extends BasePersistence<Manager> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManagerUtil} to access the manager persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the manager in the entity cache if it is enabled.
	*
	* @param manager the manager
	*/
	public void cacheResult(it.smc.liferay.feedback.model.Manager manager);

	/**
	* Caches the managers in the entity cache if it is enabled.
	*
	* @param managers the managers
	*/
	public void cacheResult(
		java.util.List<it.smc.liferay.feedback.model.Manager> managers);

	/**
	* Creates a new manager with the primary key. Does not add the manager to the database.
	*
	* @param managerId the primary key for the new manager
	* @return the new manager
	*/
	public it.smc.liferay.feedback.model.Manager create(long managerId);

	/**
	* Removes the manager with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param managerId the primary key of the manager
	* @return the manager that was removed
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager remove(long managerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	public it.smc.liferay.feedback.model.Manager updateImpl(
		it.smc.liferay.feedback.model.Manager manager, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the manager with the primary key or throws a {@link it.smc.liferay.feedback.NoSuchManagerException} if it could not be found.
	*
	* @param managerId the primary key of the manager
	* @return the manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByPrimaryKey(
		long managerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the manager with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param managerId the primary key of the manager
	* @return the manager, or <code>null</code> if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByPrimaryKey(
		long managerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the managers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set where groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] findByGroupId_PrevAndNext(
		long managerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set of managers that the user has permission to view where groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] filterFindByGroupId_PrevAndNext(
		long managerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByU_G(
		long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByU_G(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByU_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByU_G_First(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByU_G_First(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByU_G_Last(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByU_G_Last(long userId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set where userId = &#63; and groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] findByU_G_PrevAndNext(
		long managerId, long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByU_G(
		long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByU_G(
		long userId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers that the user has permissions to view where userId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> filterFindByU_G(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set of managers that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param userId the user ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] filterFindByU_G_PrevAndNext(
		long managerId, long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set where userId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] findByUserId_PrevAndNext(
		long managerId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the managers where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @return the range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the first manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns the last manager in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching manager, or <code>null</code> if a matching manager could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the managers before and after the current manager in the ordered set where companyId = &#63;.
	*
	* @param managerId the primary key of the current manager
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next manager
	* @throws it.smc.liferay.feedback.NoSuchManagerException if a manager with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.smc.liferay.feedback.model.Manager[] findByCompanyId_PrevAndNext(
		long managerId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.smc.liferay.feedback.NoSuchManagerException;

	/**
	* Returns all the managers.
	*
	* @return the managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<it.smc.liferay.feedback.model.Manager> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the managers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of managers
	* @param end the upper bound of the range of managers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of managers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.smc.liferay.feedback.model.Manager> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the managers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the managers where userId = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the managers where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the managers where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the managers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers that the user has permission to view where userId = &#63; and groupId = &#63;.
	*
	* @param userId the user ID
	* @param groupId the group ID
	* @return the number of matching managers that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByU_G(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching managers
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of managers.
	*
	* @return the number of managers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}