<h2><a href="https://leetcode.com/problems/recyclable-and-low-fat-products/">1757. Recyclable and Low Fat Products</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi" style="user-select: auto;"><a class="sql-schema-link__3cEg" style="user-select: auto;">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2" style="user-select: auto;"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z" style="user-select: auto;"></path></svg></a></div><div style="user-select: auto;"><p style="user-select: auto;">Table: <code style="user-select: auto;">Products</code></p>

<pre style="user-select: auto;">+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| product_id  | int     |
| low_fats    | enum    |
| recyclable  | enum    |
+-------------+---------+
product_id is the primary key for this table.
low_fats is an ENUM of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
recyclable is an ENUM of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.</pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;">Write an SQL query to find the ids of products that are both low fat and recyclable.</p>

<p style="user-select: auto;">Return the result table in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">The query result format is in the following example.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> 
Products table:
+-------------+----------+------------+
| product_id  | low_fats | recyclable |
+-------------+----------+------------+
| 0           | Y        | N          |
| 1           | Y        | Y          |
| 2           | N        | Y          |
| 3           | Y        | Y          |
| 4           | N        | N          |
+-------------+----------+------------+
<strong style="user-select: auto;">Output:</strong> 
+-------------+
| product_id  |
+-------------+
| 1           |
| 3           |
+-------------+
<strong style="user-select: auto;">Explanation:</strong> Only products 1 and 3 are both low fat and recyclable.
</pre>
</div>