insert into EMPLOYEE (ID, FIRST_NAME, LAST_NAME, HIRE_DATE, MRG_ID) values (hibernate_sequence.nextval, 'John','Smith','01-01-2000', NULL);
insert into EMPLOYEE (ID, FIRST_NAME, LAST_NAME, HIRE_DATE, MRG_ID) values (hibernate_sequence.nextval, 'John','Joe',' 11-01-2000', 1);
insert into EMPLOYEE (ID, FIRST_NAME, LAST_NAME, HIRE_DATE, MRG_ID) values (hibernate_sequence.nextval, 'Jessey','James','03-01-2003', 2);
insert into EMPLOYEE (ID, FIRST_NAME, LAST_NAME, HIRE_DATE, MRG_ID) values (hibernate_sequence.nextval, 'Jeremy','Winker','21-04-2011', 1);
insert into EMPLOYEE (ID, FIRST_NAME, LAST_NAME, HIRE_DATE, MRG_ID) values (hibernate_sequence.nextval, 'Julia','Gross','01-12-2012', 2);

insert into PHONE (ID, OWNER_ID, P_TYPE, P_NUMBER, P_COMMENT) VALUES (hibernate_sequence.nextval, 1, 'HOME', '12345', 'do not disturb after 21:00');
insert into PHONE (ID, OWNER_ID, P_TYPE, P_NUMBER, P_COMMENT) VALUES (hibernate_sequence.nextval, 1, 'WORK', '56565656', 'welcome');
insert into PHONE (ID, OWNER_ID, P_TYPE, P_NUMBER, P_COMMENT) VALUES (hibernate_sequence.nextval, 1, 'CELL', '87878', 'be responsible');
insert into PHONE (ID, OWNER_ID, P_TYPE, P_NUMBER, P_COMMENT) VALUES (hibernate_sequence.nextval, 2, 'WORK', '123-345', 'cool number');
insert into PHONE (ID, OWNER_ID, P_TYPE, P_NUMBER, P_COMMENT) VALUES (hibernate_sequence.nextval, 2, 'CELL', '987-234', null);