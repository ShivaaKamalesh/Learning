use logicfirst;

DROP table employee;
-- constraint 
create table employee(
	emp_id int primary key auto_increment, 
    ename varchar(30) not null,
    job_desc varchar(30) default 'unassigned',
    salary int,
    pan varchar(15) unique,
    check (salary>100000)
);

INSERT INTO employee (ename,salary) values("Ramya",300000);
select * from employee;

create table employee(
	emp_id int primary key,
    ename varchar(30),
    job_desc varchar(20),
    salary int);
-- add not null constraint
alter table employee
modify ename varchar(30) not null;

-- drop not null constraint
alter table employee
modify ename varchar(30) ;

-- add default constraint
 alter table employee
 alter job_desc set default 'unassigned';
 
 -- drop default constraint
 alter table employee
 alter job_desc drop default;
 
 -- add check constraint
 alter table employee
 add constraint chk_salary check(salary>100000);
 
 -- drop check constraint
 alter table employee
 drop check chk_salary;
 
  