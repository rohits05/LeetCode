# Write your MySQL query statement below
select name as Customers from Customers
-- where id not in(select customerId from orders)
left join Orders
            on Orders.CustomerId = Customers.id
where Orders.CustomerId is null
