
package it.smc.liferay.feedback.util.comparator;

import java.util.Date;

import com.liferay.portal.kernel.util.OrderByComparator;
import it.smc.liferay.feedback.model.Manager;

public class ManagerComparator {

	public static String ORDER_BY_ASC =  " ASC";
	public static String ORDER_BY_DESC = " DESC";

	public static OrderByComparator getManagerOrderByComparator(String orderByCol,String orderByType) {

		boolean orderByAsc = false;
		if(orderByType==null) {
			orderByAsc = true;
		} else if (orderByType.equalsIgnoreCase(ORDER_BY_ASC.trim())){
			orderByAsc = true;
		}

		OrderByComparator orderByComparator = null;
			if(orderByCol==null) {
			orderByComparator = new OrderByManagerManagerId(orderByAsc);
			} else if(orderByCol.equals("managerId")){
			orderByComparator = new OrderByManagerManagerId(orderByAsc);
			} else if(orderByCol.equals("plid")){
			orderByComparator = new OrderByManagerPlid(orderByAsc);
				} else if(orderByCol.equals("fileEntryId")){
			orderByComparator = new OrderByManagerFileEntryId(orderByAsc);
			} else if(orderByCol.equals("userManagerId")){
			orderByComparator = new OrderByManagerUserManagerId(orderByAsc);
			} else if(orderByCol.equals("status")){
			orderByComparator = new OrderByManagerStatus(orderByAsc);
			} else if(orderByCol.equals("statusDate")){
			orderByComparator = new OrderByManagerStatusDate(orderByAsc);
			}
			return orderByComparator;
	}
}

class OrderByManagerManagerId extends OrderByComparator {
	public static String ORDER_BY_FIELD = "managerId";

	public OrderByManagerManagerId(){
		this(false);
	}

	public OrderByManagerManagerId(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		Long lo1 = 0L;
		Long lo2 = 0L;

		if(o1!=null) lo1 = (Long)o1;
		if(o2!=null) lo2 = (Long)o2;

		return lo1.compareTo(lo2);
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}

class OrderByManagerPlid extends OrderByComparator {
	public static String ORDER_BY_FIELD = "plid";

	public OrderByManagerPlid(){
		this(false);
	}

	public OrderByManagerPlid(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		Long lo1 = 0L;
		Long lo2 = 0L;

		if(o1!=null) lo1 = (Long)o1;
		if(o2!=null) lo2 = (Long)o2;

		return lo1.compareTo(lo2);
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}

class OrderByManagerFileEntryId extends OrderByComparator {
	public static String ORDER_BY_FIELD = "fileEntryId";

	public OrderByManagerFileEntryId(){
		this(false);
	}

	public OrderByManagerFileEntryId(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		Long lo1 = 0L;
		Long lo2 = 0L;

		if(o1!=null) lo1 = (Long)o1;
		if(o2!=null) lo2 = (Long)o2;

		return lo1.compareTo(lo2);
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}

class OrderByManagerUserManagerId extends OrderByComparator {
	public static String ORDER_BY_FIELD = "userManagerId";

	public OrderByManagerUserManagerId(){
		this(false);
	}

	public OrderByManagerUserManagerId(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		Long lo1 = 0L;
		Long lo2 = 0L;

		if(o1!=null) lo1 = (Long)o1;
		if(o2!=null) lo2 = (Long)o2;

		return lo1.compareTo(lo2);
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}

class OrderByManagerStatus extends OrderByComparator {
	public static String ORDER_BY_FIELD = "status";

	public OrderByManagerStatus(){
		this(false);
	}

	public OrderByManagerStatus(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		int i1 = 0;
		int i2 = 0;

		if(o1!=null) return 1;
		else if (i1 < i2) return -1;
		return 0;
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}

class OrderByManagerStatusDate extends OrderByComparator {
	public static String ORDER_BY_FIELD = "statusDate";

	public OrderByManagerStatusDate(){
		this(false);
	}

	public OrderByManagerStatusDate(boolean asc){
		_asc = asc;
	}

	@Override
	public int compare(Object o1,Object o2) {

		Date date1 = new Date();
		Date date2 = new Date();

		if(o1!=null) date1 = (Date)o1;
		if(o2!=null) date2 = (Date)o2;

		return date1.compareTo(date2);
	}

	@Override
	public String[] getOrderByFields() {
		String[] orderByFields = new String[1];
		orderByFields[0] = ORDER_BY_FIELD;
		return orderByFields;
	}

	@Override
	public String getOrderBy() {
		if(_asc) return ManagerComparator.ORDER_BY_ASC;
		else return ManagerComparator.ORDER_BY_DESC;
	}

	private boolean _asc;
}




