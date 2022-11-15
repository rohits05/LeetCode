# Write your MySQL query statement below
select sell_date, count(distinct (product)) as num_sold,
	   group_concat(distinct product order by product asc separator ',') as products

from Activities a
-- Where count(distinct (product)) as num_sold and
		-- group_concat(distinct product order by product asc separator ',') as products
group by a.sell_date;