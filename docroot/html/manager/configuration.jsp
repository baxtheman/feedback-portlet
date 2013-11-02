<%@ include file="/html/manager/init.jsp" %>

<liferay-portlet:renderURL portletConfiguration="true" var="tabURL">
	<portlet:param name="redirect" value="<%= redirect %>" />
</liferay-portlet:renderURL>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveConfiguration();" %>'>
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

	<aui:fieldset>

		<aui:input label="site-enabled" name="preferences--enabled--"
			type="checkbox" value="<%= enabled %>" />

		<p>
		<liferay-ui:message key="enabled-hint"/>
		</p>

		<hr/>

		<liferay-ui:panel title="email-settings" collapsible="false">

			<aui:input label="email-subject" name="preferences--emailSubject--"
				size="50"
				type="text" value="<%= emailSubject %>" />

			<aui:input label="email-notification-list" name="preferences--emailNotificationList--"
				cols="50" rows="5"
				type="textarea" value="<%= emailNotificationList %>" />

		</liferay-ui:panel>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace />saveConfiguration() {

		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>

<br/>
<hr/>
<pre>
Developed by
<a href="http://www.liferay.com/web/baxtheman">Daniele Baggio</a> <a href="http://twitter.com/@baxtheman">@baxtheman</a>

<a href="http://www.smc.it">SMC</a> (Liferay Platinum partner for Italy)
Release 1.0 GA1
Build on november 2, 2013

<a href="https://github.com/baxtheman/feedback-portlet">Source code on Github</a>

Software acknowledgments:
<a href="http://www.xmlportletfactory.org">www.xmlportletfactory.org</a>
<a href="https://github.com/niklasvh/feedback.js">github.com/niklasvh/feedback.js</a>
<a href="http://html2canvas.hertzen.com/">http://html2canvas.hertzen.com/</a>
<a href="http://browse.deviantart.com/art/Megaphone-10442427">http://browse.deviantart.com/art/Megaphone-10442427</a>

<img src="/feedback-portlet/images/smc.jpg" />
</pre>

