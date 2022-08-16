<h2><a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/">1636. Sort Array by Increasing Frequency</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of integers <code style="user-select: auto;">nums</code>, sort the array in <strong style="user-select: auto;">increasing</strong> order based on the frequency of the values. If multiple values have the same frequency, sort them in <strong style="user-select: auto;">decreasing</strong> order.</p>

<p style="user-select: auto;">Return the <em style="user-select: auto;">sorted array</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1,2,2,2,3]
<strong style="user-select: auto;">Output:</strong> [3,1,1,2,2,2]
<strong style="user-select: auto;">Explanation:</strong> '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,3,1,3,2]
<strong style="user-select: auto;">Output:</strong> [1,3,3,2,2]
<strong style="user-select: auto;">Explanation:</strong> '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-1,1,-6,4,5,-6,1,4,1]
<strong style="user-select: auto;">Output:</strong> [5,-1,4,4,-6,-6,1,1,1]</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>