CREATE DATABASE task01
/* Accounts*/
if object_id('Accounts') is not null
drop table Accounts
go
create table Accounts
(
username nvarchar(50),
password nvarchar(50),
constraint pk_Accounts PRIMARY KEY(username )
)