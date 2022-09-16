<h2><a href="https://leetcode.com/problems/increasing-triplet-subsequence/">334. Increasing Triplet Subsequence</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if there exists a triple of indices </em><code style="user-select: auto;">(i, j, k)</code><em style="user-select: auto;"> such that </em><code style="user-select: auto;">i &lt; j &lt; k</code><em style="user-select: auto;"> and </em><code style="user-select: auto;">nums[i] &lt; nums[j] &lt; nums[k]</code>. If no such indices exists, return <code style="user-select: auto;">false</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,5]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> Any triplet where i &lt; j &lt; k is valid.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,4,3,2,1]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> No triplet exists.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,1,5,0,4,6]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> The triplet (3, 4, 5) is valid because nums[3] == 0 &lt; nums[4] == 4 &lt; nums[5] == 6.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 5 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= nums[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<strong style="user-select: auto;">Follow up:</strong> Could you implement a solution that runs in <code style="user-select: auto;">O(n)</code> time complexity and <code style="user-select: auto;">O(1)</code> space complexity?</div>