<h2><a href="https://leetcode.com/problems/house-robber/">198. House Robber</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and <b style="user-select: auto;">it will automatically contact the police if two adjacent houses were broken into on the same night</b>.</p>

<p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code> representing the amount of money of each house, return <em style="user-select: auto;">the maximum amount of money you can rob tonight <b style="user-select: auto;">without alerting the police</b></em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,1]
<strong style="user-select: auto;">Output:</strong> 4
<strong style="user-select: auto;">Explanation:</strong> Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,7,9,3,1]
<strong style="user-select: auto;">Output:</strong> 12
<strong style="user-select: auto;">Explanation:</strong> Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 400</code></li>
</ul>
</div>