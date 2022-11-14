# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
delete pH from Person pD, Person pH
where pD.email = pH.email and pD.id<pH.id;
