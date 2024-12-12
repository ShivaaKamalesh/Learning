show databases;

CREATE DATABASE LOGICFIRST;
USE LOGICFIRST;
create table student(
	id int primary key,
    name varchar(30),
    gpa decimal(3,2)

);
describe student;
alter table student add department varchar(30);
alter table student drop department;

insert into student values(1,"Arun",7.6);
select * from student;