select * from employee;

select count(*) total
from employee;

select count(*) total
from employee
where job_desc="manager";

select avg(salary)
from employee
where job_desc="manager";

select sum(salary)
from employee
where job_desc="manager";

select ucase(ename),salary
from employee;

select ucase(ename),char_length(ename),salary
from employee;

select ename,concat("Rs.",salary)
from employee;

select ename,concat("Rs.",format(salary,0))
from employee;

select ename,left(job_desc,3)
from employee;