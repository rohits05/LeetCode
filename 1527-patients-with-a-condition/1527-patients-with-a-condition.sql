# Write your MySQL query statement below
select * from Patients
-- where conditions like 'DIAB1%' or conditions like '% DIAB1%'
where conditions REGEXP '\\bDIAB1'; -- short-hand approach!