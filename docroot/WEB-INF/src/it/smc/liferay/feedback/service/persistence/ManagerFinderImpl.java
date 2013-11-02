

package it.smc.liferay.feedback.service.persistence;

import it.smc.liferay.feedback.model.Manager;
import it.smc.liferay.feedback.model.impl.ManagerImpl;
import it.smc.liferay.feedback.model.impl.ManagerModelImpl;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

/**
 * @author dbg
 */
public class ManagerFinderImpl extends BasePersistenceImpl<Manager>
	implements ManagerFinder {



	public static final String COUNT_BY_C_G_P_D_UM_S =
			ManagerFinder.class.getName() + ".countByC_G_P_D_UM_S";

	public static final String FIND_BY_C_G_P_D_UM_S =
		ManagerFinder.class.getName() + ".findByC_G_P_D_UM_S";

	@SuppressWarnings("unchecked")
	public int countByC_G_P_D_UM_S(
			long companyId, long groupId,
		long plid,
		String description,
		long userManagerId,
		int status,
			boolean andOperator)
		throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(COUNT_BY_C_G_P_D_UM_S);

			sql = StringUtil.replace(
					sql, "[$TABLE_NAME$]", ManagerModelImpl.TABLE_NAME);

			boolean empty = true;

			if (plid <= 0) {
				sql = StringUtil.replace(
						sql, PLID_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (Validator.isNull(description)) {
				sql = StringUtil.replace(
						sql, DESCRIPTION_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (userManagerId <= 0) {
				sql = StringUtil.replace(
						sql, USERMANAGERID_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (status <= 0) {
				sql = StringUtil.replace(
						sql, STATUS_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}

			if (empty) {
				sql = StringUtil.replace(
						sql, "[$AND_CONNECTOR$]", StringPool.BLANK);

				int lastOpenIndex = sql.lastIndexOf("(");

				if (lastOpenIndex > -1) {
					sql = sql.substring(0, lastOpenIndex);
				}
			}
			else {
				sql = StringUtil.replace(
						sql, "[$AND_CONNECTOR$]", " AND ");

				int lastAndOrIndex = sql.lastIndexOf("[$AND_OR_CONNECTOR$]");

				if (lastAndOrIndex > -1) {
					sql = sql.substring(0, lastAndOrIndex);

					sql += " )";
				}
			}

			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);

			sql = sql.trim();

			if (_log.isDebugEnabled()) {
				_log.debug(sql);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);
			qPos.add(groupId);

			if (plid > 0) {
				qPos.add(plid);
			}
			if (Validator.isNotNull(description)) {
				qPos.add(description);
			}
			if (userManagerId > 0) {
				qPos.add(userManagerId);
			}
			if (status > 0) {
				qPos.add(status);
			}

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Manager> findByC_G_P_D_UM_S(
			long companyId, long groupId,
		long plid,
		String description,
		long userManagerId,
		int status,
			boolean andOperator, int start, int end, OrderByComparator obc)
		throws SystemException {

		Session session = null;

		try {
			session = openSession();

			String sql = CustomSQLUtil.get(FIND_BY_C_G_P_D_UM_S);

			sql = StringUtil.replace(
					sql, "[$TABLE_NAME$]", ManagerModelImpl.TABLE_NAME);

			String orderbysql = StringPool.BLANK;

			int orderByIndex = sql.toUpperCase().lastIndexOf("ORDER BY");

			if (orderByIndex > 0)
				orderbysql = sql.substring(orderByIndex);

			boolean empty = true;

			if (plid <= 0) {
				sql = StringUtil.replace(
						sql, PLID_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (Validator.isNull(description)) {
				sql = StringUtil.replace(
						sql, DESCRIPTION_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (userManagerId <= 0) {
				sql = StringUtil.replace(
						sql, USERMANAGERID_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}
			if (status <= 0) {
				sql = StringUtil.replace(
						sql, STATUS_SQL, StringPool.BLANK);
			}
			else {
				empty = false;
			}

			if (empty) {
				sql = StringUtil.replace(
						sql, "[$AND_CONNECTOR$]", StringPool.BLANK);

				int lastOpenIndex = sql.lastIndexOf("(");

				if (lastOpenIndex > -1) {
					sql = sql.substring(0, lastOpenIndex);
				}
			}
			else {
				sql = StringUtil.replace(
						sql, "[$AND_CONNECTOR$]", " AND ");

				int lastAndOrIndex = sql.lastIndexOf("[$AND_OR_CONNECTOR$]");

				if (lastAndOrIndex > -1) {
					sql = sql.substring(0, lastAndOrIndex);

					sql += " )";
				}
			}

			sql = CustomSQLUtil.replaceAndOperator(sql, andOperator);
			sql = CustomSQLUtil.replaceOrderBy(sql, obc);

			sql = sql + StringPool.SPACE + orderbysql;

			sql = sql.trim();

			if (_log.isDebugEnabled()) {
				_log.debug(sql);
			}

			SQLQuery q = session.createSQLQuery(sql);

			q.addEntity(ManagerModelImpl.TABLE_NAME, ManagerImpl.class);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(companyId);
			qPos.add(groupId);

			if (plid > 0) {
				qPos.add(plid);
			}
			if (Validator.isNotNull(description)) {
				qPos.add(description);
			}
			if (userManagerId > 0) {
				qPos.add(userManagerId);
			}
			if (status > 0) {
				qPos.add(status);
			}

			List<Manager> results = (List<Manager>)QueryUtil.list(
					q, getDialect(), start, end);

			return results;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected static final String PLID_SQL =
			"(" + ManagerModelImpl.TABLE_NAME + ".plid = ?) [$AND_OR_CONNECTOR$]";
	protected static final String DESCRIPTION_SQL =
			"(lower(" + ManagerModelImpl.TABLE_NAME + ".description) LIKE ?) [$AND_OR_CONNECTOR$]";
	protected static final String USERMANAGERID_SQL =
			"(" + ManagerModelImpl.TABLE_NAME + ".userManagerId = ?) [$AND_OR_CONNECTOR$]";
	protected static final String STATUS_SQL =
			"(" + ManagerModelImpl.TABLE_NAME + ".status = ?) [$AND_OR_CONNECTOR$]";

	private static Log _log = LogFactoryUtil.getLog(ManagerFinderImpl.class);
}
