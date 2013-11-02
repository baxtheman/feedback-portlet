
<%@include file="/html/manager/init.jsp" %>

<%
String toolbarItem = ParamUtil.getString(request, "toolbarItem", "view");

boolean canAdd = false;

%>

<div class="lfr-portlet-toolbar">
	<portlet:renderURL var="viewManagerURL">
		<portlet:param name="<%=pageParam %>" value="/html/manager/view.jsp" />
	</portlet:renderURL>

	<span class="lfr-toolbar-button view-button <%= toolbarItem.equals("view-all") ? "current" : StringPool.BLANK %>">
		<a href="<%= viewManagerURL %>"><liferay-ui:message key="view-all" /></a>
	</span>

	<c:if test="<%= canAdd %>">
		<portlet:renderURL var="addManagerURL">
			<portlet:param name="jspPage" value="/html/manager/edit_manager.jsp" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<span class="lfr-toolbar-button add-button <%= toolbarItem.equals("add") ? "current" : StringPool.BLANK %>">
			<a href="<%= addManagerURL %>"><liferay-ui:message key="add" /></a>
		</span>
	</c:if>
</div>