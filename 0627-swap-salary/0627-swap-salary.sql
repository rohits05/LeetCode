# Write your MySQL query statement below
# update salary 
# set sex = if(sex like 'f%', 'm%', 'f%')

# Using Case Statement!
update Salary
set sex = 
        case when sex like 'f%' then 'm%'
        when sex like 'm%' then 'f%' 
        end