<h2><a href="https://leetcode.com/problems/maximum-number-of-pairs-in-array/">2341. Maximum Number of Pairs in Array</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code>. In one operation, you may do the following:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Choose <strong style="user-select: auto;">two</strong> integers in <code style="user-select: auto;">nums</code> that are <strong style="user-select: auto;">equal</strong>.</li>
	<li style="user-select: auto;">Remove both integers from <code style="user-select: auto;">nums</code>, forming a <strong style="user-select: auto;">pair</strong>.</li>
</ul>

<p style="user-select: auto;">The operation is done on <code style="user-select: auto;">nums</code> as many times as possible.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a <strong style="user-select: auto;">0-indexed</strong> integer array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> of size </em><code style="user-select: auto;">2</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[0]</code><em style="user-select: auto;"> is the number of pairs that are formed and </em><code style="user-select: auto;">answer[1]</code><em style="user-select: auto;"> is the number of leftover integers in </em><code style="user-select: auto;">nums</code><em style="user-select: auto;"> after doing the operation as many times as possible</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,3,2,1,3,2,2]
<strong style="user-select: auto;">Output:</strong> [3,1]
<strong style="user-select: auto;">Explanation:</strong>
Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,1]
<strong style="user-select: auto;">Output:</strong> [1,0]
<strong style="user-select: auto;">Explanation:</strong> Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [0]
<strong style="user-select: auto;">Output:</strong> [0,1]
<strong style="user-select: auto;">Explanation:</strong> No pairs can be formed, and there is 1 number leftover in nums.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 100</code></li>
</ul>
</div>