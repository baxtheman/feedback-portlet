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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.smc.liferay.feedback.service.http.ManagerServiceSoap}.
 *
 * @author    dbg
 * @see       it.smc.liferay.feedback.service.http.ManagerServiceSoap
 * @generated
 */
public class ManagerSoap implements Serializable {
	public static ManagerSoap toSoapModel(Manager model) {
		ManagerSoap soapModel = new ManagerSoap();

		soapModel.setManagerId(model.getManagerId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPlid(model.getPlid());
		soapModel.setDescription(model.getDescription());
		soapModel.setUrl(model.getUrl());
		soapModel.setUserAgent(model.getUserAgent());
		soapModel.setInternalNote(model.getInternalNote());
		soapModel.setFile(model.getFile());
		soapModel.setUserManagerId(model.getUserManagerId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static ManagerSoap[] toSoapModels(Manager[] models) {
		ManagerSoap[] soapModels = new ManagerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ManagerSoap[][] toSoapModels(Manager[][] models) {
		ManagerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ManagerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ManagerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ManagerSoap[] toSoapModels(List<Manager> models) {
		List<ManagerSoap> soapModels = new ArrayList<ManagerSoap>(models.size());

		for (Manager model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ManagerSoap[soapModels.size()]);
	}

	public ManagerSoap() {
	}

	public long getPrimaryKey() {
		return _managerId;
	}

	public void setPrimaryKey(long pk) {
		setManagerId(pk);
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

	private long _managerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}