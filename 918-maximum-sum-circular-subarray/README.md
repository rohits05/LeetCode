<h2><a href="https://leetcode.com/problems/maximum-sum-circular-subarray/">918. Maximum Sum Circular Subarray</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <strong style="user-select: auto;">circular integer array</strong> <code style="user-select: auto;">nums</code> of length <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">the maximum possible sum of a non-empty <strong style="user-select: auto;">subarray</strong> of </em><code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">circular array</strong> means the end of the array connects to the beginning of the array. Formally, the next element of <code style="user-select: auto;">nums[i]</code> is <code style="user-select: auto;">nums[(i + 1) % n]</code> and the previous element of <code style="user-select: auto;">nums[i]</code> is <code style="user-select: auto;">nums[(i - 1 + n) % n]</code>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subarray</strong> may only include each element of the fixed buffer <code style="user-select: auto;">nums</code> at most once. Formally, for a subarray <code style="user-select: auto;">nums[i], nums[i + 1], ..., nums[j]</code>, there does not exist <code style="user-select: auto;">i &lt;= k1</code>, <code style="user-select: auto;">k2 &lt;= j</code> with <code style="user-select: auto;">k1 % n == k2 % n</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,-2,3,-2]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> Subarray [3] has maximum sum 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,-3,5]
<strong style="user-select: auto;">Output:</strong> 10
<strong style="user-select: auto;">Explanation:</strong> Subarray [5,5] has maximum sum 5 + 5 = 10.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-3,-2,-3]
<strong style="user-select: auto;">Output:</strong> -2
<strong style="user-select: auto;">Explanation:</strong> Subarray [-2] has maximum sum -2.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-3 * 10<sup style="user-select: auto;">4</sup> &lt;= nums[i] &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>