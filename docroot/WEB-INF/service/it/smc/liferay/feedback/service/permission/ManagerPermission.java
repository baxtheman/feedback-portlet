

package it.smc.liferay.feedback.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

/**
 * @author dbg
 */
public class ManagerPermission {

	public static final String _CLASS_NAME = "it.smc.liferay.feedback.manager";

	public static void check(
			PermissionChecker permissionChecker, long groupId, String actionId)
		throws PortalException {

		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, long groupId, String actionId) {


		return permissionChecker.hasPermission(
			groupId, _CLASS_NAME, groupId, actionId);
	}
}
