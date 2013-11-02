
<%@include file="/init.jsp" %>

<%@ page import="it.smc.liferay.feedback.ManagerException" %>
<%@ page import="it.smc.liferay.feedback.NoSuchManagerException" %>
<%@ page import="it.smc.liferay.feedback.model.Manager" %>
<%@ page import="it.smc.liferay.feedback.manager.search.ManagerDisplayTerms" %>
<%@ page import="it.smc.liferay.feedback.manager.search.ManagerSearch" %>
<%@ page import="it.smc.liferay.feedback.manager.search.ManagerSearchTerms" %>
<%@ page import="it.smc.liferay.feedback.service.ManagerLocalServiceUtil" %>
<%@ page import="it.smc.liferay.feedback.service.permission.ManagerPermission" %>
<%@ page import="it.smc.liferay.feedback.service.permission.ManagerEntryPermission" %>
<%@page import="it.smc.liferay.feedback.util.ActionKeys"%>
<%@page import="it.smc.liferay.feedback.util.WebKeys"%>

<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>

<%
boolean enabled = GetterUtil.getBoolean(preferences.getValue("enabled", null));
String emailSubject = GetterUtil.getString(preferences.getValue("emailSubject", ""));
String emailNotificationList = GetterUtil.getString(preferences.getValue("emailNotificationList", ""));
%>

