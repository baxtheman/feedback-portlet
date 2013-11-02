
<%@ include file="/init.jsp" %>

<%@page import="it.smc.liferay.feedback.service.permission.ManagerPermission"%>
<%@page import="it.smc.liferay.feedback.util.ActionKeys"%>
<%@page import="it.smc.liferay.feedback.util.PortletKeys"%>

<%@page import="com.liferay.portal.kernel.servlet.BrowserSnifferUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

<%
PortletPreferences managerPrefs = PortletPreferencesFactoryUtil.getPortletSetup(request, PortletKeys.MANAGER_PORTLET);

boolean canAdd = ManagerPermission.contains(permissionChecker, scopeGroupId, ActionKeys.ADD_FEEDBACK);

boolean enabled = canAdd && GetterUtil.getBoolean(managerPrefs.getValue("enabled", null));

boolean browserDenied = BrowserSnifferUtil.isIe(request);
%>

<c:if test="<%= enabled %>">

	<liferay-util:html-bottom>
		<link rel="stylesheet" href="/feedback-portlet/css/feedback.css"  type="text/css" media="screen" />
	</liferay-util:html-bottom>

	<aui:script use="liferay-dockbar">

		var dockBar = A.one('#dockbar');

		if (dockBar) {

			var options = {
				name: 'feedback',
				text:'<liferay-ui:message key="give-a-feedback"/>',
				className: 'feedback',
				url:'javascript:window.loadFeedback();'
			};

			<%-- code from DockBar.addItem() --%>

			if (options.url) {
				options.text = '<a href="' + options.url + '">' + options.text + '</a>';
			}

			var item = A.Node.create('<li class="' + (options.className || '') + '">' + options.text + '</li>');

			dockBar.one('> ul').appendChild(item);

		}

	</aui:script>

	<aui:script>

		<c:if test="<%= browserDenied %>">

		Liferay.provide(
			window,
			'loadFeedback',
			function(event) {
				alert('<%= UnicodeFormatter.toString(LanguageUtil.get(pageContext, "sorry-not-ie")) %>');
			},
			[]
		);

		</c:if>

		<c:if test="<%= !browserDenied %>">

		Liferay.provide(
			window,
			'loadFeedback',
			function(event) {

				var A = AUI();

				A.Get.script(
					[
						'/feedback-portlet/js/feedback/feedback.js',
					],
					{
						onSuccess: function() {

							window.Feedback.XHR.prototype.send = function( feedback, callback ) {

								A.io.request(
									'<liferay-portlet:actionURL name="sendFeedback"></liferay-portlet:actionURL>',
									{
										method: 'POST',
										data: {
											description: feedback[0].description,
											url: top.location.href,
											image: feedback[1]
										},
										on: {
											failure: function() {
												callback(false);
											},
											success: function() {
												callback(true);
											}
										}
									}
								);
							};

							var node = A.one('#dockbar .aui-toolbar')._node;

							Feedback({
								appendTo: null,

								label: '<liferay-ui:message key="send-feedback"/>',
								header: '<liferay-ui:message key="send-feedback"/>',
								nextLabel: '<liferay-ui:message key="continue"/>',
								reviewLabel: '<liferay-ui:message key="review"/>',
								sendLabel: '<liferay-ui:message key="send"/>',
								closeLabel: '<liferay-ui:message key="close"/>',
								descriptionLabel: '<liferay-ui:message key="description-label"/>',
								selectAreaLabel: '<liferay-ui:message key="select-area-label"/>',
								messageSuccess: '<liferay-ui:message key="msg-success"/>',
								messageError: '<liferay-ui:message key="msg-error"/>',

								h2cPath:'/feedback-portlet/js/feedback/html2canvas.js',
								proxy: null,
								useCORS: true,
								allowTaint: true
							}).open();
						}

					}
				);
			},
			['get','aui-base','aui-io']
		);

		</c:if>

	</aui:script>

</c:if>

