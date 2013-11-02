
<%@include file="/html/manager/init.jsp" %>

<%
portletURL.setParameter(pageParam, "/html/manager/view.jsp");
portletURL.setParameter("redirect", redirect);
%>

<c:if test="<%= !enabled %>">
<p class="portlet-msg-alert">
	<liferay-ui:message key="feedback-not-enabled"/>
</p>
</c:if>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="<%=pageParam %>" value="/html/manager/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= portletURL %>" method="get" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

		<liferay-util:include page="/htmlmanager/toolbar.jsp"  servletContext="<%= application %>">
			<liferay-util:param name="toolbarItem" value="view-all" />
		</liferay-util:include>

		<liferay-ui:search-container
			searchContainer="<%= new ManagerSearch(renderRequest, portletURL) %>"
		>
			<liferay-ui:search-form
				page="/html/manager/manager_search.jsp"
				servletContext="<%= application %>"
			/>

			<%
			ManagerSearchTerms searchTerms = (ManagerSearchTerms)searchContainer.getSearchTerms();
			%>

			<liferay-ui:search-container-results>
				<%@ include file="/html/manager/manager_search_results.jspf" %>
			</liferay-ui:search-container-results>

			<liferay-ui:search-container-row
				className="it.smc.liferay.feedback.model.Manager"
				escapedModel="true"
				keyProperty="managerId"
				modelVar="manager"
			>

		<%
		PortletURL editManagerURL = null;
		boolean canView = true;

		canView = ManagerEntryPermission.contains(permissionChecker, manager.getManagerId(), ActionKeys.VIEW);

		if (canView) {
			editManagerURL = renderResponse.createRenderURL();

			editManagerURL.setParameter("managerId", String.valueOf(manager.getManagerId()));
			editManagerURL.setParameter("jspPage", "/html/manager/edit_manager.jsp");
			editManagerURL.setParameter("redirect", currentURL);
		}
		%>

				<liferay-ui:search-container-column-text name="layout" property="plidDescription" href="<%= editManagerURL %>" />
				<liferay-ui:search-container-column-text property="description" href="<%= editManagerURL %>" />
				<liferay-ui:search-container-column-text name="user" property="userFullName" href="<%= editManagerURL %>" />
				<liferay-ui:search-container-column-text name="create-date" property="createDate" href="<%= editManagerURL %>" />

				<liferay-ui:search-container-column-jsp
					align="right"
					path="/html/manager/manager_action.jsp"
				/>

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator />

		</liferay-ui:search-container>

</aui:form>


