# Write your MySQL query statement below
select user_id, concat(upper(left(name,1)),lower(right(name,length(name)-1))) as name -- Using concat method with specific index pos to get the desired left & right chars
from Users
order by 1;-- sorting in ascending order ASC | DESC |