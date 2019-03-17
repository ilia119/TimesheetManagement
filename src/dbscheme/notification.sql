create table Notification (
id bigint NOT NULL PRIMARY KEY,
createdAt DATETIME NOT NULL,
employeId bigint NOT NULL,
status varchar(100) NOT NULL,
title varchar(100) NOT NULL,
description text(200),
link varchar(100)
);

