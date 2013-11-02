create table feedback_Manager (
	managerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	plid LONG,
	description STRING null,
	url VARCHAR(1000) null,
	userAgent VARCHAR(500) null,
	internalNote VARCHAR(75) null,
	file VARCHAR(75) null,
	userManagerId LONG,
	status INTEGER,
	statusDate DATE null
);