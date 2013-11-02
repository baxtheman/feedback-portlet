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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import it.smc.liferay.feedback.model.Manager;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Manager in entity cache.
 *
 * @author dbg
 * @see Manager
 * @generated
 */
public class ManagerCacheModel implements CacheModel<Manager>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{managerId=");
		sb.append(managerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", plid=");
		sb.append(plid);
		sb.append(", description=");
		sb.append(description);
		sb.append(", url=");
		sb.append(url);
		sb.append(", userAgent=");
		sb.append(userAgent);
		sb.append(", internalNote=");
		sb.append(internalNote);
		sb.append(", file=");
		sb.append(file);
		sb.append(", userManagerId=");
		sb.append(userManagerId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	public Manager toEntityModel() {
		ManagerImpl managerImpl = new ManagerImpl();

		managerImpl.setManagerId(managerId);
		managerImpl.setGroupId(groupId);
		managerImpl.setCompanyId(companyId);
		managerImpl.setUserId(userId);

		if (userName == null) {
			managerImpl.setUserName(StringPool.BLANK);
		}
		else {
			managerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			managerImpl.setCreateDate(null);
		}
		else {
			managerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			managerImpl.setModifiedDate(null);
		}
		else {
			managerImpl.setModifiedDate(new Date(modifiedDate));
		}

		managerImpl.setPlid(plid);

		if (description == null) {
			managerImpl.setDescription(StringPool.BLANK);
		}
		else {
			managerImpl.setDescription(description);
		}

		if (url == null) {
			managerImpl.setUrl(StringPool.BLANK);
		}
		else {
			managerImpl.setUrl(url);
		}

		if (userAgent == null) {
			managerImpl.setUserAgent(StringPool.BLANK);
		}
		else {
			managerImpl.setUserAgent(userAgent);
		}

		if (internalNote == null) {
			managerImpl.setInternalNote(StringPool.BLANK);
		}
		else {
			managerImpl.setInternalNote(internalNote);
		}

		if (file == null) {
			managerImpl.setFile(StringPool.BLANK);
		}
		else {
			managerImpl.setFile(file);
		}

		managerImpl.setUserManagerId(userManagerId);
		managerImpl.setStatus(status);

		if (statusDate == Long.MIN_VALUE) {
			managerImpl.setStatusDate(null);
		}
		else {
			managerImpl.setStatusDate(new Date(statusDate));
		}

		managerImpl.resetOriginalValues();

		return managerImpl;
	}

	public long managerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long plid;
	public String description;
	public String url;
	public String userAgent;
	public String internalNote;
	public String file;
	public long userManagerId;
	public int status;
	public long statusDate;
}