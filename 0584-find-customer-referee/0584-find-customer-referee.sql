# Write your MySQL query statement below
select name from Customer
-- where referee_id <> 2 or referee_id is null
where ifnull(referee_id, 0) <> 2; -- using IFNULL !