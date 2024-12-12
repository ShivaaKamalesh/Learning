use logicfirst;
select * from employee;

select * 
from employee
order by job_desc;

select job_desc,avg(salary)
from employee
group by job_desc;

select job_desc,count(emp_id)
from employee
group by job_desc;

select job_desc,count(emp_id)
from employee
group by job_desc
having count(emp_id)>1
order by job_desc;