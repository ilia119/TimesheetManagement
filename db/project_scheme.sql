CREATE TABLE `project` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `logoUrl` varchar(45) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `manHours` int(11) NOT NULL,
  `code` varchar(45) NOT NULL,
  `colour` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table Assigment (
projectId bigint NOT NULL, 
employeeId bigint NOT NULL, 
workLoadInMinuts int 
);

create table Invitations (
employeeId bigint NOT NULL PRIMARY KEY,
companyId bigint NOT NULL,
email VARCHAR(150) NOT NULL,
invitationsCode VARCHAR(40) NOT NULL,
dateEnd datetime NOT NULL,
status varchar(25) NOT NULL
);

create table Timesheet (
id bigint NOT NULL primary key,
periodId bigint NOT NULL,
timesheetJson json NOT NULL,
status varchar(100) NOT NULL
);
