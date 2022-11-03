# Write your MySQL query statement below
SELECT product_id

FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y'
-- WHERE low_fats IN('Y') AND recyclable IN('Y') 
-- WHERE low_fats LIKE 'Y%' AND recyclable LIKE 'Y%'
-- WHERE low_fats REGEXP '^Y' AND recyclable REGEXP '^Y'