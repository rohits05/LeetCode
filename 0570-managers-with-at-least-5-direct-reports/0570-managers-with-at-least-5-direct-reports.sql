# Write your MySQL query statement below
select name from employee where id in
(   select managerId from employee e
    group by e.managerId having count(e.id) >= 5
 );
