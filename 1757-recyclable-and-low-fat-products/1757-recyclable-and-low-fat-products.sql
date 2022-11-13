# Write your MySQL query statement below
select product_id from Products
where low_fats like 'Y' and recyclable like 'Y';
-- WHERE low_fats IN('Y') AND recyclable IN('Y') 
-- WHERE low_fats LIKE 'Y%' AND recyclable LIKE 'Y%'
-- WHERE low_fats REGEXP '^Y' AND recyclable REGEXP '^Y'