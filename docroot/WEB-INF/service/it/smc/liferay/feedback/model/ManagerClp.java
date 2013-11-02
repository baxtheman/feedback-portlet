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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dbg
 */
public class ManagerClp extends BaseModelImpl<Manager> implements Manager {
	public ManagerClp() {
	}

	public Class<?> getModelClass() {
		return Manager.class;
	}

	public String getModelClassName() {
		return Manager.class.getName();
	}

	public long getPrimaryKey() {
		return _managerId;
	}

	public void setPrimaryKey(long primaryKey) {
		setManagerId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_managerId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getManagerId() {
		return _managerId;
	}

	public void setManagerId(long managerId) {
		_managerId = managerId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getPlid() {
		return _plid;
	}

	public void setPlid(long plid) {
		_plid = plid;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getUserAgent() {
		return _userAgent;
	}

	public void setUserAgent(String userAgent) {
		_userAgent = userAgent;
	}

	public String getInternalNote() {
		return _internalNote;
	}

	public void setInternalNote(String internalNote) {
		_internalNote = internalNote;
	}

	public String getFile() {
		return _file;
	}

	public void setFile(String file) {
		_file = file;
	}

	public long getUserManagerId() {
		return _userManagerId;
	}

	public void setUserManagerId(long userManagerId) {
		_userManagerId = userManagerId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public java.lang.String getPlidUrl() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getPlidDescription() {
		throw new UnsupportedOperationException();
	}

	public java.lang.String getUserFullName() {
		throw new UnsupportedOperationException();
	}

	public BaseModel<?> getManagerRemoteModel() {
		return _managerRemoteModel;
	}

	public void setManagerRemoteModel(BaseModel<?> managerRemoteModel) {
		_managerRemoteModel = managerRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ManagerLocalServiceUtil.addManager(this);
		}
		else {
			ManagerLocalServiceUtil.updateManager(this);
		}
	}

	@Override
	public Manager toEscapedModel() {
		return (Manager)Proxy.newProxyInstance(Manager.class.getClassLoader(),
			new Class[] { Manager.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ManagerClp clone = new ManagerClp();

		clone.setManagerId(getManagerId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setPlid(getPlid());
		clone.setDescription(getDescription());
		clone.setUrl(getUrl());
		clone.setUserAgent(getUserAgent());
		clone.setInternalNote(getInternalNote());
		clone.setFile(getFile());
		clone.setUserManagerId(getUserManagerId());
		clone.setStatus(getStatus());
		clone.setStatusDate(getStatusDate());

		return clone;
	}

	public int compareTo(Manager manager) {
		long primaryKey = manager.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ManagerClp manager = null;

		try {
			manager = (ManagerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = manager.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{managerId=");
		sb.append(getManagerId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", plid=");
		sb.append(getPlid());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", userAgent=");
		sb.append(getUserAgent());
		sb.append(", internalNote=");
		sb.append(getInternalNote());
		sb.append(", file=");
		sb.append(getFile());
		sb.append(", userManagerId=");
		sb.append(getUserManagerId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("it.smc.liferay.feedback.model.Manager");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>managerId</column-name><column-value><![CDATA[");
		sb.append(getManagerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plid</column-name><column-value><![CDATA[");
		sb.append(getPlid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAgent</column-name><column-value><![CDATA[");
		sb.append(getUserAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>internalNote</column-name><column-value><![CDATA[");
		sb.append(getInternalNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>file</column-name><column-value><![CDATA[");
		sb.append(getFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userManagerId</column-name><column-value><![CDATA[");
		sb.append(getUserManagerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _managerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _plid;
	private String _description;
	private String _url;
	private String _userAgent;
	private String _internalNote;
	private String _file;
	private long _userManagerId;
	private int _status;
	private Date _statusDate;
	private BaseModel<?> _managerRemoteModel;
}