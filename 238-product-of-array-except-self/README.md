<h2><a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, return <em style="user-select: auto;">an array</em> <code style="user-select: auto;">answer</code> <em style="user-select: auto;">such that</em> <code style="user-select: auto;">answer[i]</code> <em style="user-select: auto;">is equal to the product of all the elements of</em> <code style="user-select: auto;">nums</code> <em style="user-select: auto;">except</em> <code style="user-select: auto;">nums[i]</code>.</p>

<p style="user-select: auto;">The product of any prefix or suffix of <code style="user-select: auto;">nums</code> is <strong style="user-select: auto;">guaranteed</strong> to fit in a <strong style="user-select: auto;">32-bit</strong> integer.</p>

<p style="user-select: auto;">You must write an algorithm that runs in&nbsp;<code style="user-select: auto;">O(n)</code>&nbsp;time and without using the division operation.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4]
<strong style="user-select: auto;">Output:</strong> [24,12,8,6]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-1,1,0,-3,3]
<strong style="user-select: auto;">Output:</strong> [0,0,9,0,0]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-30 &lt;= nums[i] &lt;= 30</code></li>
	<li style="user-select: auto;">The product of any prefix or suffix of <code style="user-select: auto;">nums</code> is <strong style="user-select: auto;">guaranteed</strong> to fit in a <strong style="user-select: auto;">32-bit</strong> integer.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong>&nbsp;Can you solve the problem in <code style="user-select: auto;">O(1)&nbsp;</code>extra&nbsp;space complexity? (The output array <strong style="user-select: auto;">does not</strong> count as extra space for space complexity analysis.)</p>
</div>