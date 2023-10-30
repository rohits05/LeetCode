# Write your MySQL query statement below
select u.unique_id, e.name from Employees e
left join EmployeeUNI u on u.id = e.id;