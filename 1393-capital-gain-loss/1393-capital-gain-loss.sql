# Write your MySQL query statement below
select distinct stock_name, sum(if(operation = 'Buy', -price, price)) 'capital_gain_loss'
from Stocks group by stock_name;