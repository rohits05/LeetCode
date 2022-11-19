# Write your MySQL query statement below
select author_id as id from Views 
-- left join viewer_id on viewer_id = author_id
where author_id = viewer_id group by id
order by 1 asc;
