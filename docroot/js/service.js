Liferay.Service.register("Liferay.Service.feedback", "it.smc.liferay.feedback.service", "feedback-portlet");

Liferay.Service.registerClass(
	Liferay.Service.feedback, "Manager",
	{
		deleteManager: true,
		updateManager: true,
		getManager: true,
		getGroupEntries: true,
		getGroupEntriesCount: true
	}
);