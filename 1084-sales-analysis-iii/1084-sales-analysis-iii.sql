# Write your MySQL query statement below
select p.product_id, p.product_name from Product p
join Sales s on p.product_id = s.product_id group by s.product_id
having max(s.sale_date)<= '2019-03-31' and min(s.sale_date)>='2019-01-01';
