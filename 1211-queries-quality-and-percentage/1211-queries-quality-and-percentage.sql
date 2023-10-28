# Write your MySQL query statement below
select query_name, round(sum(rating/position)/count(query_name), 2) 
as quality, round(sum(case when rating < 3 then 1.00 else 0.00 end)*100/count(query_name), 2) 
as poor_query_percentage from queries group by query_name;