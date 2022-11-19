# Write your MySQL query statement below
select sD.id from Weather as fD, Weather as sD
where datediff(sD.recordDate, fD.recordDate)=1 and sD.temperature > fD.temperature;