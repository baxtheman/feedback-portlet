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

package it.smc.liferay.feedback.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import it.smc.liferay.feedback.service.ManagerServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link it.smc.liferay.feedback.service.ManagerServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link it.smc.liferay.feedback.model.ManagerSoap}.
 * If the method in the service utility returns a
 * {@link it.smc.liferay.feedback.model.Manager}, that is translated to a
 * {@link it.smc.liferay.feedback.model.ManagerSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    dbg
 * @see       ManagerServiceHttp
 * @see       it.smc.liferay.feedback.model.ManagerSoap
 * @see       it.smc.liferay.feedback.service.ManagerServiceUtil
 * @generated
 */
public class ManagerServiceSoap {
	public static void deleteManager(long managerId) throws RemoteException {
		try {
			ManagerServiceUtil.deleteManager(managerId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static it.smc.liferay.feedback.model.ManagerSoap updateManager(
		long managerId, long plid, java.lang.String description,
		long userManagerId, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			it.smc.liferay.feedback.model.Manager returnValue = ManagerServiceUtil.updateManager(managerId,
					plid, description, userManagerId, status, serviceContext);

			return it.smc.liferay.feedback.model.ManagerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static it.smc.liferay.feedback.model.ManagerSoap getManager(
		long managerId) throws RemoteException {
		try {
			it.smc.liferay.feedback.model.Manager returnValue = ManagerServiceUtil.getManager(managerId);

			return it.smc.liferay.feedback.model.ManagerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static it.smc.liferay.feedback.model.ManagerSoap[] getGroupEntries(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<it.smc.liferay.feedback.model.Manager> returnValue = ManagerServiceUtil.getGroupEntries(groupId,
					start, end);

			return it.smc.liferay.feedback.model.ManagerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getGroupEntriesCount(long groupId)
		throws RemoteException {
		try {
			int returnValue = ManagerServiceUtil.getGroupEntriesCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ManagerServiceSoap.class);
}