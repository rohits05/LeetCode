# Write your MySQL query statement below
select Register.contest_id, round((count(Register.user_id) / (select count(*) from Users))*100, 2) as percentage from Register
join Users on Register.user_id = Users.user_id
group by Register.contest_id order by percentage desc, Register.contest_id;