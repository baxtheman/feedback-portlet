
<%@include file="/html/manager/init.jsp" %>

<%
ManagerSearch searchContainer = (ManagerSearch) request.getAttribute("liferay-ui:search:searchContainer");

ManagerDisplayTerms displayTerms = (ManagerDisplayTerms) searchContainer.getDisplayTerms();

String formId = "toggle_id_manager_search";
String advancedFormCssClass = "taglib-search-toggle-advanced";
%>


<div class="taglib-search-toggle">
	<aui:input id="<%= formId + displayTerms.ADVANCED_SEARCH %>" name="<%= displayTerms.ADVANCED_SEARCH %>" type="hidden" value="true" />

	<div class="<%= advancedFormCssClass %>" id="<%= formId %>advanced">

		<%--

		<liferay-util:buffer var="andOperator">
			<aui:select cssClass="inline-control" inlineField="<%= true %>" label="" name="<%= displayTerms.AND_OPERATOR %>">
				<aui:option label="all" selected="<%= displayTerms.isAndOperator() %>" value="1" />
				<aui:option label="any" selected="<%= !displayTerms.isAndOperator() %>" value="0" />
			</aui:select>
		</liferay-util:buffer>

		<liferay-ui:message arguments="<%= andOperator %>" key="match-x-of-the-following-fields" />
		--%>

		<aui:fieldset>
<%-- 		<aui:input name="<%= displayTerms.PLID %>" size="20" type="text" value="<%= displayTerms.getPlid() %>" /> --%>
		<aui:input name="<%= displayTerms.DESCRIPTION %>" size="20" type="text" value="<%= displayTerms.getDescription() %>" />
<%-- 		<aui:input name="<%= displayTerms.USERMANAGERID %>" size="20" type="text" value="<%= displayTerms.getUserManagerId() %>" /> --%>
<%-- 		<aui:input name="<%= displayTerms.STATUS %>" size="20" type="text" value="<%= displayTerms.getStatus() %>" /> --%>
		</aui:fieldset>

		<aui:button type="submit" value="search" />
	</div>
</div>

<div class="separator"><!-- --></div>
