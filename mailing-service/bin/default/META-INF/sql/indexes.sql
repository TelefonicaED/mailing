create index IX_3CBF2869 on Mail_MailTemplate (companyId);
create index IX_7998B52B on Mail_MailTemplate (groupId);
create index IX_E4114293 on Mail_MailTemplate (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A81F51D5 on Mail_MailTemplate (uuid_[$COLUMN_LENGTH:75$], groupId);