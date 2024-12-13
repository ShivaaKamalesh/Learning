Employee Table
emp_id	ename	job_desc	salary	branch_id
1	Ram	ADMIN	1000000	2
2	Harini	MANAGER	2500000	2
3	George	SALES	2000000	1
4	Ramya	SALES	1300000	1
5	Meena	HR	2000000	3
6	Ashok	MANAGER	3000000	1
7	Abdul	HR	2000000	3
8	Ramya	ENGINEER	1000000	2
9	Raghu	CEO	8000000	1
10	Arvind	MANAGER	2800000	3


Branch Table
branch_id	br_name	addr	manager_id
1	Chennai	16, ABC Road	6
2	Coimbatore	20, 15th Block	2
3	Mumbai	25, XYZ Road	10



USE logicfirst;


CREATE TABLE branch (
    branch_id INT PRIMARY KEY AUTO_INCREMENT,
    br_name VARCHAR(30) NOT NULL,
    addr VARCHAR(30),
    manager_id INT
    
);

CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    ename VARCHAR(30) NOT NULL,
    job_desc VARCHAR(30),
    salary INT,
    branch_id INT,
    CONSTRAINT fk_branchId FOREIGN KEY (branch_id) REFERENCES branch(branch_id)
);


ALTER TABLE branch
ADD CONSTRAINT fk_managerId FOREIGN KEY (manager_id) REFERENCES employee(emp_id);
select * from employee;
select * from branch;
