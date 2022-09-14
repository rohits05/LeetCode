<h2><a href="https://leetcode.com/problems/find-triangular-sum-of-an-array/">2221. Find Triangular Sum of an Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">nums</code>, where <code style="user-select: auto;">nums[i]</code> is a digit between <code style="user-select: auto;">0</code> and <code style="user-select: auto;">9</code> (<strong style="user-select: auto;">inclusive</strong>).</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">triangular sum</strong> of <code style="user-select: auto;">nums</code> is the value of the only element present in <code style="user-select: auto;">nums</code> after the following process terminates:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Let <code style="user-select: auto;">nums</code> comprise of <code style="user-select: auto;">n</code> elements. If <code style="user-select: auto;">n == 1</code>, <strong style="user-select: auto;">end</strong> the process. Otherwise, <strong style="user-select: auto;">create</strong> a new <strong style="user-select: auto;">0-indexed</strong> integer array <code style="user-select: auto;">newNums</code> of length <code style="user-select: auto;">n - 1</code>.</li>
	<li style="user-select: auto;">For each index <code style="user-select: auto;">i</code>, where <code style="user-select: auto;">0 &lt;= i &lt;&nbsp;n - 1</code>, <strong style="user-select: auto;">assign</strong> the value of <code style="user-select: auto;">newNums[i]</code> as <code style="user-select: auto;">(nums[i] + nums[i+1]) % 10</code>, where <code style="user-select: auto;">%</code> denotes modulo operator.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Replace</strong> the array <code style="user-select: auto;">nums</code> with <code style="user-select: auto;">newNums</code>.</li>
	<li style="user-select: auto;"><strong style="user-select: auto;">Repeat</strong> the entire process starting from step 1.</li>
</ol>

<p style="user-select: auto;">Return <em style="user-select: auto;">the triangular sum of</em> <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/02/22/ex1drawio.png" style="width: 250px; height: 250px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,5]
<strong style="user-select: auto;">Output:</strong> 8
<strong style="user-select: auto;">Explanation:</strong>
The above diagram depicts the process from which we obtain the triangular sum of the array.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong>
Since there is only one element in nums, the triangular sum is the value of that element itself.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= nums[i] &lt;= 9</code></li>
</ul>
</div>