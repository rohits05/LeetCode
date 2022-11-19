# Write your MySQL query statement below
select customer_id, count(visit_id) count_no_trans from visits v
left join transactions t using(visit_id)
where t.transaction_id is null group by 1;