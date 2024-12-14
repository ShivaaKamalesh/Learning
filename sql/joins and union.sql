CREATE DATABASE IF NOT EXISTS logicthird;
USE logicthird;

DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS branch;

CREATE TABLE branch (
    branch_id INT PRIMARY KEY AUTO_INCREMENT,
    br_name VARCHAR(30) NOT NULL,
    addr VARCHAR(200)
);

CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    ename VARCHAR(30) NOT NULL,
    job_desc VARCHAR(30),
    salary INT,
    branch_id INT,
    CONSTRAINT FK_branch_id FOREIGN KEY (branch_id) REFERENCES branch(branch_id)
);

-- Step 5: Insert data into the branch table
INSERT INTO branch (branch_id, br_name, addr) VALUES
(1, "chennai", "16 ABC Road"),
(2, "coimbatore", "120 15th block"),
(3, "Mumbai", "25 xyz Road"),
(4, "Hydrabad", "32 10th Street");

INSERT INTO employee (emp_id, ename, job_desc, salary, branch_id) VALUES
(1, 'Ram', 'ADMIN', 1000000, 2),
(2, 'Harini', 'MANAGER', 2500000, 2),
(3, 'George', 'SALES', 2000000, 1),
(4, 'Ramya', 'SALES', 1300000, 2),
(5, 'Meena', 'HR', 2000000, 3),
(6, 'Ashok', 'MANAGER', 3000000, 1),
(7, 'Abdul', 'HR', 2000000, 1),
(8, 'Ramya', 'ENGINEER', 1000000, 2),
(9, 'Raghu', 'CEO', 8000000, 3),
(10, 'Arvind', 'MANAGER', 2800000, 3),
(11, 'Akshay', 'ENGINEER', 1000000, 1),
(12, 'John', 'ADMIN', 2200000, 1),
(13, 'Abinaya', 'ENGINEER', 2100000, 2),
(14, 'Vidya', 'ADMIN', 2200000, NULL),
(15, 'Ranjani', 'ENGINEER', 2100000, NULL);

select * from branch;
select * from employee;
-- inner join 
select e.emp_id,e.ename,e.job_desc,b.br_name
from employee as e
inner join branch as b
on e.branch_id=b.b_id
order by e.emp_id;

-- left join
select employee.emp_id,employee.ename,employee.job_desc,branch.br_name
from employee
left join branch
on employee.branch_id=branch.branch_id
order by emp_id;

-- similar to inner join but not using join 
select employee.emp_id,employee.ename,employee.job_desc,branch.br_name
from employee,branch
where employee.branch_id=branch.branch_id;

-- right join
select employee.emp_id,employee.ename,employee.job_desc,branch.br_name
from employee
right join branch
on employee.branch_id=branch.branch_id
order by emp_id;

-- cross join
select employee.emp_id,employee.ename,employee.job_desc,branch.br_name
from employee
cross join branch;
 
 -- br_name emp_count
 select b.br_name,count(e.emp_id)
 from branch as b
 join employee as e
 on b.branch_id=e.branch_id
 group by e.branch_id;

-- union
create table clients(
	client_id int primary key auto_increment,
    location varchar(30) not null,
    addr varchar(200));
insert into clients values(1,"newyork","25 10th block");
insert into clients values(2,"coimbatore","255 15th block");
insert into clients values(3,"londow","1555 10th block");

select * from branch;
select * from clients;
-- removing duplicate values 
select * from branch
union
select * from clients;

-- not removing duplicate values
select * from branch
union all
select * from clients;
 
