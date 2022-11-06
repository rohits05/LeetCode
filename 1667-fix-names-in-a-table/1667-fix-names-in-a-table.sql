# Write your MySQL query statement below
SELECT user_id, CONCAT(UPPER(LEFT(name,1)),LOWER(RIGHT(name,LENGTH(name)-1))) AS name -- Using concat method with specific index pos to get the desired left & right chars
FROM Users
ORDER BY user_id -- sorting in ascending order