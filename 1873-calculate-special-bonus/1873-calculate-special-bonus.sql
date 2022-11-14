# Write your MySQL query statement below
# SELECT employee_id,
# IF (employee_id%2
#     AND name not like "M%", salary, 0) 
#     as bonus
select employee_id, 
       # if (employee_id % 2 = 1
       # and name not like 'M%', salary, 0)
       # as bonus
       # By using Case Statement!
     case when employee_id % 2 = 1 and name not like "M%"
     then salary else 0 end as bonus
from Employees
order by 1;  
 