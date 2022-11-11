# Write your MySQL query statement below
Select sell_date, count(distinct (product)) as num_sold,
		group_concat(distinct product order by product asc separator ',') as products

From Activities a
-- Where count(distinct (product)) as num_sold and
		-- group_concat(distinct product order by product asc separator ',') as products
Group By a.sell_date
Order by a.sell_date asc;