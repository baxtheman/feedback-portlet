
<%@include file="/html/manager/init.jsp" %>

<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Manager manager = (Manager)row.getObject();
long managerId = manager.getManagerId();

boolean canUpdate = true;
boolean canDelete = true;

canUpdate = ManagerEntryPermission.contains(permissionChecker, managerId, ActionKeys.UPDATE);
canDelete = ManagerEntryPermission.contains(permissionChecker, managerId, ActionKeys.DELETE);
%>

<liferay-ui:icon-menu>

	<c:if test="<%= canUpdate %>">
		<portlet:renderURL var="editManagerURL">
			<portlet:param name="managerId" value="<%= String.valueOf(managerId) %>" />
			<portlet:param name="jspPage" value="/html/manager/edit_manager.jsp" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:icon image="edit" url="<%= editManagerURL %>" />

	</c:if>

	<c:if test="<%= canDelete %>">
		<portlet:actionURL name="deleteManager" var="deleteManagerURL">
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="managerId" value="<%= String.valueOf(managerId) %>" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%= deleteManagerURL %>" />
	</c:if>

</liferay-ui:icon-menu>