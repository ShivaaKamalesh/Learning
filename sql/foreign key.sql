use logicfirst;
drop table employee;

Create table branch(
	branch_id int primary key auto_increment,
    br_name varchar(30) not null,
    addr varchar(30)
    
    );
drop table employee;
create table employee(
	emp_id int primary key auto_increment,
    ename varchar(30) not null,
    job_desc varchar(30) ,
    salary int,
    branch_id int,
    constraint fk_branchId foreign key(branch_id) references branch(branch_id)
	);
-- to drop the forign key
alter table employee
drop foreign key fk_branchId;

describe table employee;
select * from employee;