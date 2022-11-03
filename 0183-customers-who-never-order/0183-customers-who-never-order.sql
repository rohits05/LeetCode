# Write your MySQL query statement below
SELECT name AS Customers
FROM customers
WHERE id NOT IN (SELECT CustomerId FROM Orders)
# LEFT JOIN ORDERS
# ON ORDERS.CustomerID = Customers.Id
# WHERE Orders.CustomerID IS null