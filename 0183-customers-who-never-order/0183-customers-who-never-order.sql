# Write your MySQL query statement below
select name as Customers from Customers
-- where id not in(select customerId from orders)
left join Orders
          on Orders.customerId = Customers.id
where Orders.customerId is null
