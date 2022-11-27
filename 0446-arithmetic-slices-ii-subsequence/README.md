<h2><a href="https://leetcode.com/problems/arithmetic-slices-ii-subsequence/">446. Arithmetic Slices II - Subsequence</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, return <em style="user-select: auto;">the number of all the <strong style="user-select: auto;">arithmetic subsequences</strong> of</em> <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">A sequence of numbers is called arithmetic if it consists of <strong style="user-select: auto;">at least three elements</strong> and if the difference between any two consecutive elements is the same.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">[1, 3, 5, 7, 9]</code>, <code style="user-select: auto;">[7, 7, 7, 7]</code>, and <code style="user-select: auto;">[3, -1, -5, -9]</code> are arithmetic sequences.</li>
	<li style="user-select: auto;">For example, <code style="user-select: auto;">[1, 1, 2, 5, 7]</code> is not an arithmetic sequence.</li>
</ul>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> of an array is a sequence that can be formed by removing some elements (possibly none) of the array.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">[2,5,10]</code> is a subsequence of <code style="user-select: auto;">[1,2,1,<strong style="user-select: auto;"><u style="user-select: auto;">2</u></strong>,4,1,<u style="user-select: auto;"><strong style="user-select: auto;">5</strong></u>,<u style="user-select: auto;"><strong style="user-select: auto;">10</strong></u>]</code>.</li>
</ul>

<p style="user-select: auto;">The test cases are generated so that the answer fits in <strong style="user-select: auto;">32-bit</strong> integer.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [2,4,6,8,10]
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> All arithmetic subsequence slices are:
[2,4,6]
[4,6,8]
[6,8,10]
[2,4,6,8]
[4,6,8,10]
[2,4,6,8,10]
[2,6,10]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [7,7,7,7,7]
<strong style="user-select: auto;">Output:</strong> 16
<strong style="user-select: auto;">Explanation:</strong> Any subsequence of this array is arithmetic.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1&nbsp; &lt;= nums.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= nums[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
</ul>
</div>