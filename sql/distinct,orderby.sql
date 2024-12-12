show databases;

CREATE DATABASE LOGICFIRST;
USE LOGICFIRST;
create table employee(
	emp_id int primary key,
    ename varchar(30),
    job_desc varchar(30),
    salary int
);
INSERT INTO employee (Emp_id, Ename, job_desc, Salary) VALUES
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
select job_desc from employee;

select distinct job_desc from employee;
select * from employee
order by ename; 

select * from employee
order by salary DESC;

select * from employee
order by salary,ename;

select * from employee
where job_desc="Manager"
order by salary;

select * from employee
order by (case job_desc
when 'ceo' then 1
when "manager" then 2
when "hr" then 3
when "analyst" then 4
when "sales" then 5
else 100 end
);

