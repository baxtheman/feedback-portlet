
package it.smc.liferay.feedback.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.service.ManagerLocalServiceUtil;


/**
 * @author dbg
 */
public class ManagerEntryPermission {

	public static void check(
			PermissionChecker permissionChecker, Manager entry,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, entry, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long entryId, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, entryId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, Manager entry,
		String actionId) {


		if (permissionChecker.hasOwnerPermission(
				entry.getCompanyId(), Manager.class.getName(),
				entry.getPrimaryKey(), entry.getUserId(), actionId)) {

			return true;
		}

		return permissionChecker.hasPermission(
			entry.getGroupId(), Manager.class.getName(), entry.getPrimaryKey(),
			actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long entryId, String actionId)
		throws PortalException, SystemException {

		Manager entry = ManagerLocalServiceUtil.getManager(entryId);

		return contains(permissionChecker, entry, actionId);
	}
}
