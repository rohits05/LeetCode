# Write your MySQL query statement below
select event_day 'day', emp_id 'emp_id', sum(out_time - in_time) 'total_time'
from Employees group by event_day, emp_id;