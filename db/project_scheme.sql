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

create table Timesheet (
id bigint NOT NULL primary key,
periodId bigint NOT NULL,
timesheetJson json NOT NULL,
status varchar(100) NOT NULL
);
