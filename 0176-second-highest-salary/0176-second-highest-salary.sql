# Write your MySQL query statement below
# select max(salary) as SecondHighestSalary from Employee
# where salary not in (select max(salary) from Employee)
select max(e.salary) as SecondHighestSalary
from Employee e
right join Employee r on e.salary < r.salary