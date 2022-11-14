# Write your MySQL query statement below
update salary 
set sex = if(sex like 'f%', 'm%', 'f%')
# UPDATE Salary
# SET sex = 
# CASE
#     WHEN sex = "f" THEN "m"
#     WHEN sex = "m" THEN "f"
# END