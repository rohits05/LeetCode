<h2><a href="https://leetcode.com/problems/split-array-into-consecutive-subsequences/">659. Split Array into Consecutive Subsequences</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> that is <strong style="user-select: auto;">sorted in non-decreasing order</strong>.</p>

<p style="user-select: auto;">Determine if it is possible to split <code style="user-select: auto;">nums</code> into <strong style="user-select: auto;">one or more subsequences</strong> such that <strong style="user-select: auto;">both</strong> of the following conditions are true:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Each subsequence is a <strong style="user-select: auto;">consecutive increasing sequence</strong> (i.e. each integer is <strong style="user-select: auto;">exactly one</strong> more than the previous integer).</li>
	<li style="user-select: auto;">All subsequences have a length of <code style="user-select: auto;">3</code><strong style="user-select: auto;"> or more</strong>.</li>
</ul>

<p style="user-select: auto;">Return <code style="user-select: auto;">true</code><em style="user-select: auto;"> if you can split </em><code style="user-select: auto;">nums</code><em style="user-select: auto;"> according to the above conditions, or </em><code style="user-select: auto;">false</code><em style="user-select: auto;"> otherwise</em>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">subsequence</strong> of an array is a new array that is formed from the original array by deleting some (can be none) of the elements without disturbing the relative positions of the remaining elements. (i.e., <code style="user-select: auto;">[1,3,5]</code> is a subsequence of <code style="user-select: auto;">[<u style="user-select: auto;">1</u>,2,<u style="user-select: auto;">3</u>,4,<u style="user-select: auto;">5</u>]</code> while <code style="user-select: auto;">[1,3,2]</code> is not).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,3,4,5]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> nums can be split into the following subsequences:
[<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">2</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">3</u></strong>,3,4,5] --&gt; 1, 2, 3
[1,2,3,<strong style="user-select: auto;"><u style="user-select: auto;">3</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">4</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">5</u></strong>] --&gt; 3, 4, 5
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,3,4,4,5,5]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> nums can be split into the following subsequences:
[<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">2</u></strong>,<strong style="user-select: auto;"><u style="user-select: auto;">3</u></strong>,3,<strong style="user-select: auto;"><u style="user-select: auto;">4</u></strong>,4,<strong style="user-select: auto;"><u style="user-select: auto;">5</u></strong>,5] --&gt; 1, 2, 3, 4, 5
[1,2,3,<strong style="user-select: auto;"><u style="user-select: auto;">3</u></strong>,4,<strong style="user-select: auto;"><u style="user-select: auto;">4</u></strong>,5,<strong style="user-select: auto;"><u style="user-select: auto;">5</u></strong>] --&gt; 3, 4, 5
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,4,5]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> It is impossible to split nums into consecutive increasing subsequences of length 3 or more.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= nums[i] &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">nums</code> is sorted in <strong style="user-select: auto;">non-decreasing</strong> order.</li>
</ul>
</div>