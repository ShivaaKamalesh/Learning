show databases;

CREATE DATABASE LOGICFIRST;
USE LOGICFIRST;
create table employee(
	emp_id int primary key,
    ename varchar(30),
    job_desc varchar(30),
    salary int
);
INSERT INTO employee (Emp_id, ename, job_desc, salary) VALUES
(1, 'Ram', 'ADMIN', 1000000),
(2, 'Harini', 'MANAGER', 2500000),
(3, 'George', 'SALES', 2000000),
(4, 'Ramya', 'SALES', 1300000),
(5, 'Meena', 'HR', 2000000),
(6, 'Ashok', 'MANAGER', 3000000),
(7, 'Abdul', 'HR', 2000000),
(8, 'Ramya', 'ENGINEER', 1000000),
(9, 'Raghu', 'CEO', 8000000),
(10, 'Arvind', 'MANAGER', 2800000),
(11, 'Akshay', 'ENGINEER', 1000000),
(12, 'John', 'ADMIN', 2200000),
(13, 'Abinaya', 'ENGINEER', 2100000);

select * from employee; 
select * from employee
where ename="Ramya";
select * from employee
where ename<>"Ramya";
select * from employee
where salary<260000 and job_desc="manager";

select * from employee
where job_desc="hr" or job_desc="sales";

select * from employee
where job_desc in("HR","sales");

select * from employee
where job_desc not in("CEO","manager");

select * from employee
limit 5;

select * from employee
where ename LIKE 'A%';

select * from employee
where ename LIKE 'A%A';

select * from employee
where ename LIKE '%i%';

select * from employee
where ename LIKE '___i%';

UPDATE employee
SET Job_desc = 'ANALYST'
WHERE Job_desc = 'ENGINEER';

delete from employee
where emp_id=12;