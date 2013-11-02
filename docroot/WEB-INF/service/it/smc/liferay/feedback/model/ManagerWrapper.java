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

package it.smc.liferay.feedback.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Manager}.
 * </p>
 *
 * @author    dbg
 * @see       Manager
 * @generated
 */
public class ManagerWrapper implements Manager, ModelWrapper<Manager> {
	public ManagerWrapper(Manager manager) {
		_manager = manager;
	}

	public Class<?> getModelClass() {
		return Manager.class;
	}

	public String getModelClassName() {
		return Manager.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("managerId", getManagerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("plid", getPlid());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("userAgent", getUserAgent());
		attributes.put("internalNote", getInternalNote());
		attributes.put("file", getFile());
		attributes.put("userManagerId", getUserManagerId());
		attributes.put("status", getStatus());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long managerId = (Long)attributes.get("managerId");

		if (managerId != null) {
			setManagerId(managerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long plid = (Long)attributes.get("plid");

		if (plid != null) {
			setPlid(plid);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String userAgent = (String)attributes.get("userAgent");

		if (userAgent != null) {
			setUserAgent(userAgent);
		}

		String internalNote = (String)attributes.get("internalNote");

		if (internalNote != null) {
			setInternalNote(internalNote);
		}

		String file = (String)attributes.get("file");

		if (file != null) {
			setFile(file);
		}

		Long userManagerId = (Long)attributes.get("userManagerId");

		if (userManagerId != null) {
			setUserManagerId(userManagerId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	* Returns the primary key of this manager.
	*
	* @return the primary key of this manager
	*/
	public long getPrimaryKey() {
		return _manager.getPrimaryKey();
	}

	/**
	* Sets the primary key of this manager.
	*
	* @param primaryKey the primary key of this manager
	*/
	public void setPrimaryKey(long primaryKey) {
		_manager.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the manager ID of this manager.
	*
	* @return the manager ID of this manager
	*/
	public long getManagerId() {
		return _manager.getManagerId();
	}

	/**
	* Sets the manager ID of this manager.
	*
	* @param managerId the manager ID of this manager
	*/
	public void setManagerId(long managerId) {
		_manager.setManagerId(managerId);
	}

	/**
	* Returns the group ID of this manager.
	*
	* @return the group ID of this manager
	*/
	public long getGroupId() {
		return _manager.getGroupId();
	}

	/**
	* Sets the group ID of this manager.
	*
	* @param groupId the group ID of this manager
	*/
	public void setGroupId(long groupId) {
		_manager.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this manager.
	*
	* @return the company ID of this manager
	*/
	public long getCompanyId() {
		return _manager.getCompanyId();
	}

	/**
	* Sets the company ID of this manager.
	*
	* @param companyId the company ID of this manager
	*/
	public void setCompanyId(long companyId) {
		_manager.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this manager.
	*
	* @return the user ID of this manager
	*/
	public long getUserId() {
		return _manager.getUserId();
	}

	/**
	* Sets the user ID of this manager.
	*
	* @param userId the user ID of this manager
	*/
	public void setUserId(long userId) {
		_manager.setUserId(userId);
	}

	/**
	* Returns the user uuid of this manager.
	*
	* @return the user uuid of this manager
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _manager.getUserUuid();
	}

	/**
	* Sets the user uuid of this manager.
	*
	* @param userUuid the user uuid of this manager
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_manager.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this manager.
	*
	* @return the user name of this manager
	*/
	public java.lang.String getUserName() {
		return _manager.getUserName();
	}

	/**
	* Sets the user name of this manager.
	*
	* @param userName the user name of this manager
	*/
	public void setUserName(java.lang.String userName) {
		_manager.setUserName(userName);
	}

	/**
	* Returns the create date of this manager.
	*
	* @return the create date of this manager
	*/
	public java.util.Date getCreateDate() {
		return _manager.getCreateDate();
	}

	/**
	* Sets the create date of this manager.
	*
	* @param createDate the create date of this manager
	*/
	public void setCreateDate(java.util.Date createDate) {
		_manager.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this manager.
	*
	* @return the modified date of this manager
	*/
	public java.util.Date getModifiedDate() {
		return _manager.getModifiedDate();
	}

	/**
	* Sets the modified date of this manager.
	*
	* @param modifiedDate the modified date of this manager
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_manager.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the plid of this manager.
	*
	* @return the plid of this manager
	*/
	public long getPlid() {
		return _manager.getPlid();
	}

	/**
	* Sets the plid of this manager.
	*
	* @param plid the plid of this manager
	*/
	public void setPlid(long plid) {
		_manager.setPlid(plid);
	}

	/**
	* Returns the description of this manager.
	*
	* @return the description of this manager
	*/
	public java.lang.String getDescription() {
		return _manager.getDescription();
	}

	/**
	* Sets the description of this manager.
	*
	* @param description the description of this manager
	*/
	public void setDescription(java.lang.String description) {
		_manager.setDescription(description);
	}

	/**
	* Returns the url of this manager.
	*
	* @return the url of this manager
	*/
	public java.lang.String getUrl() {
		return _manager.getUrl();
	}

	/**
	* Sets the url of this manager.
	*
	* @param url the url of this manager
	*/
	public void setUrl(java.lang.String url) {
		_manager.setUrl(url);
	}

	/**
	* Returns the user agent of this manager.
	*
	* @return the user agent of this manager
	*/
	public java.lang.String getUserAgent() {
		return _manager.getUserAgent();
	}

	/**
	* Sets the user agent of this manager.
	*
	* @param userAgent the user agent of this manager
	*/
	public void setUserAgent(java.lang.String userAgent) {
		_manager.setUserAgent(userAgent);
	}

	/**
	* Returns the internal note of this manager.
	*
	* @return the internal note of this manager
	*/
	public java.lang.String getInternalNote() {
		return _manager.getInternalNote();
	}

	/**
	* Sets the internal note of this manager.
	*
	* @param internalNote the internal note of this manager
	*/
	public void setInternalNote(java.lang.String internalNote) {
		_manager.setInternalNote(internalNote);
	}

	/**
	* Returns the file of this manager.
	*
	* @return the file of this manager
	*/
	public java.lang.String getFile() {
		return _manager.getFile();
	}

	/**
	* Sets the file of this manager.
	*
	* @param file the file of this manager
	*/
	public void setFile(java.lang.String file) {
		_manager.setFile(file);
	}

	/**
	* Returns the user manager ID of this manager.
	*
	* @return the user manager ID of this manager
	*/
	public long getUserManagerId() {
		return _manager.getUserManagerId();
	}

	/**
	* Sets the user manager ID of this manager.
	*
	* @param userManagerId the user manager ID of this manager
	*/
	public void setUserManagerId(long userManagerId) {
		_manager.setUserManagerId(userManagerId);
	}

	/**
	* Returns the status of this manager.
	*
	* @return the status of this manager
	*/
	public int getStatus() {
		return _manager.getStatus();
	}

	/**
	* Sets the status of this manager.
	*
	* @param status the status of this manager
	*/
	public void setStatus(int status) {
		_manager.setStatus(status);
	}

	/**
	* Returns the status date of this manager.
	*
	* @return the status date of this manager
	*/
	public java.util.Date getStatusDate() {
		return _manager.getStatusDate();
	}

	/**
	* Sets the status date of this manager.
	*
	* @param statusDate the status date of this manager
	*/
	public void setStatusDate(java.util.Date statusDate) {
		_manager.setStatusDate(statusDate);
	}

	public boolean isNew() {
		return _manager.isNew();
	}

	public void setNew(boolean n) {
		_manager.setNew(n);
	}

	public boolean isCachedModel() {
		return _manager.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_manager.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _manager.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _manager.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_manager.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _manager.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_manager.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ManagerWrapper((Manager)_manager.clone());
	}

	public int compareTo(it.smc.liferay.feedback.model.Manager manager) {
		return _manager.compareTo(manager);
	}

	@Override
	public int hashCode() {
		return _manager.hashCode();
	}

	public com.liferay.portal.model.CacheModel<it.smc.liferay.feedback.model.Manager> toCacheModel() {
		return _manager.toCacheModel();
	}

	public it.smc.liferay.feedback.model.Manager toEscapedModel() {
		return new ManagerWrapper(_manager.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _manager.toString();
	}

	public java.lang.String toXmlString() {
		return _manager.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_manager.persist();
	}

	public java.lang.String getPlidDescription()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _manager.getPlidDescription();
	}

	public java.lang.String getPlidUrl()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _manager.getPlidUrl();
	}

	public java.lang.String getUserFullName()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _manager.getUserFullName();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Manager getWrappedManager() {
		return _manager;
	}

	public Manager getWrappedModel() {
		return _manager;
	}

	public void resetOriginalValues() {
		_manager.resetOriginalValues();
	}

	private Manager _manager;
}