<h2><a href="https://leetcode.com/problems/maximum-product-subarray/">152. Maximum Product Subarray</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, find a contiguous non-empty subarray within the array that has the largest product, and return <em style="user-select: auto;">the product</em>.</p>

<p style="user-select: auto;">The test cases are generated so that the answer will fit in a <strong style="user-select: auto;">32-bit</strong> integer.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subarray</strong> is a contiguous subsequence of the array.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,3,-2,4]
<strong style="user-select: auto;">Output:</strong> 6
<strong style="user-select: auto;">Explanation:</strong> [2,3] has the largest product 6.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-2,0,-1]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> The result cannot be 2, because [-2,-1] is not a subarray.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10 &lt;= nums[i] &lt;= 10</code></li>
	<li style="user-select: auto;">The product of any prefix or suffix of <code style="user-select: auto;">nums</code> is <strong style="user-select: auto;">guaranteed</strong> to fit in a <strong style="user-select: auto;">32-bit</strong> integer.</li>
</ul>
</div>