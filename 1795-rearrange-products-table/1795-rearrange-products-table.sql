/* Write your T-SQL query statement below */
select product_id, store, price
from (select product_id, store1, store2, store3 from Products) p
unpivot (price for store in (store1, store2, store3)) as data;