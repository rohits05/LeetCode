# Write your MySQL query statement below
# SELECT employee_id,
# IF (employee_id%2
#     AND name not like "M%", salary, 0) 
#     as bonus
SELECT employee_id, 
            CASE WHEN employee_id%2=1 
            AND name NOT LIKE 'M%' 
            THEN salary ELSE 0 END bonus 
            -- SQL dosen't have if() method
FROM Employees ORDER BY 1