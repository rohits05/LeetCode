# Write your MySQL query statement below
select customer_id, count(visit_id) as count_no_trans from visits v
-- left join transactions t using(visit_id)
where visit_id not in (select visit_id from Transactions) group by 1;
-- where t.transaction_id is null group by 1 / visit_id; 
