-- date
use logicfirst;
alter table employee add column hire_date DATE;
select * from employee;

UPDATE employee
SET hire_date = '2021-06-05'
WHERE Emp_id > 0;

UPDATE employee
SET hire_date = '2021-06-25'
WHERE job_desc = 'hr' AND Emp_id > 0;
-- current time
select now();

select date(now());

select curdate();

select date_format(curdate(),"%d/%m/%y");

-- difference between 2 date

SELECT DATEDIFF(CURDATE(), '2025-06-26');