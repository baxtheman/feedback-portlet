
<%@include file="/html/manager/init.jsp" %>

<%@page import="it.smc.liferay.feedback.util.WebKeys"%>

<%
Manager manager = (Manager) request.getAttribute(WebKeys.MANAGER);
long managerId = 0;

if (manager != null) {
	managerId = manager.getManagerId();
}

boolean canUpdate = ManagerEntryPermission.contains(permissionChecker, managerId, ActionKeys.UPDATE);
boolean canDelete = ManagerEntryPermission.contains(permissionChecker, managerId, ActionKeys.DELETE);
%>

<portlet:actionURL name="updateManager" var="updateManagerURL">
	<portlet:param name="jspPage" value="/html/manager/edit_manager.jsp" />
	<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:actionURL>

<liferay-ui:header
	backURL="<%= redirect %>"
	title='<%= (manager == null) ? "new-manager" : "" %>'
/>


<aui:form action="<%= updateManagerURL %>" method="post" name="fm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "updateManager();" %>'>
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (manager == null) ? Constants.ADD : Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
	<aui:input name="managerId" type="hidden" value="<%= managerId %>" />

	<liferay-ui:error exception="<%= ManagerException.class %>" message="generic-error-manager" />
	<liferay-ui:error exception="<%= NoSuchManagerException.class %>" message="no-such-manager" />

	<aui:model-context model="<%= Manager.class %>" bean="<%= manager %>" />

	<aui:fieldset>

		<aui:field-wrapper label="layout">
			<%= manager.getPlidDescription() %>
		</aui:field-wrapper>

		<aui:field-wrapper label="url">
			<a href="<%= manager.getUrl() %>"><%= StringUtil.shorten(manager.getUrl(),80) %></a>
		</aui:field-wrapper>

		<aui:field-wrapper label="user-agent">
			<%= manager.getUserAgent() %>
		</aui:field-wrapper>

		<aui:field-wrapper label="user">
			<%= manager.getUserFullName() %>
		</aui:field-wrapper>

		<aui:field-wrapper label="create-date">
			<%= manager.getCreateDate() %>
		</aui:field-wrapper>

		<aui:input name="description" />

<%-- 		<aui:input name="userManagerId" /> --%>

<%-- 		<aui:input name="status" /> --%>

		<liferay-portlet:resourceURL id="image" var="imageURL">
			<portlet:param name="managerId" value="<%= String.valueOf(managerId) %>" />
		</liferay-portlet:resourceURL>

		<aui:field-wrapper label="screenshot">
			<img src="<%= imageURL %>" style="width:100%">
		</aui:field-wrapper>

	</aui:fieldset>

	<aui:button-row>
<%-- 		<aui:button type="submit" /> --%>

		<aui:button type="cancel" onClick="<%= redirect %>" />
	</aui:button-row>

</aui:form>

<aui:script>
	function <portlet:namespace />updateManager() {
		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>
