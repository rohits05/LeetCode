<h2><a href="https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/">1770. Maximum Score from Performing Multiplication Operations</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two integer arrays <code style="user-select: auto;">nums</code> and <code style="user-select: auto;">multipliers</code><strong style="user-select: auto;"> </strong>of size <code style="user-select: auto;">n</code> and <code style="user-select: auto;">m</code> respectively, where <code style="user-select: auto;">n &gt;= m</code>. The arrays are <strong style="user-select: auto;">1-indexed</strong>.</p>

<p style="user-select: auto;">You begin with a score of <code style="user-select: auto;">0</code>. You want to perform <strong style="user-select: auto;">exactly</strong> <code style="user-select: auto;">m</code> operations. On the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> operation <strong style="user-select: auto;">(1-indexed)</strong>, you will:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Choose one integer <code style="user-select: auto;">x</code> from <strong style="user-select: auto;">either the start or the end </strong>of the array <code style="user-select: auto;">nums</code>.</li>
	<li style="user-select: auto;">Add <code style="user-select: auto;">multipliers[i] * x</code> to your score.</li>
	<li style="user-select: auto;">Remove <code style="user-select: auto;">x</code> from the array <code style="user-select: auto;">nums</code>.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum</strong> score after performing </em><code style="user-select: auto;">m</code> <em style="user-select: auto;">operations.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3], multipliers = [3,2,1]
<strong style="user-select: auto;">Output:</strong> 14
<strong style="user-select: auto;">Explanation:</strong>&nbsp;An optimal solution is as follows:
- Choose from the end, [1,2,<strong style="user-select: auto;"><u style="user-select: auto;">3</u></strong>], adding 3 * 3 = 9 to the score.
- Choose from the end, [1,<strong style="user-select: auto;"><u style="user-select: auto;">2</u></strong>], adding 2 * 2 = 4 to the score.
- Choose from the end, [<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>], adding 1 * 1 = 1 to the score.
The total score is 9 + 4 + 1 = 14.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [-5,-3,-3,-2,7,1], multipliers = [-10,-5,3,4,6]
<strong style="user-select: auto;">Output:</strong> 102
<strong style="user-select: auto;">Explanation: </strong>An optimal solution is as follows:
- Choose from the start, [<u style="user-select: auto;"><strong style="user-select: auto;">-5</strong></u>,-3,-3,-2,7,1], adding -5 * -10 = 50 to the score.
- Choose from the start, [<strong style="user-select: auto;"><u style="user-select: auto;">-3</u></strong>,-3,-2,7,1], adding -3 * -5 = 15 to the score.
- Choose from the start, [<strong style="user-select: auto;"><u style="user-select: auto;">-3</u></strong>,-2,7,1], adding -3 * 3 = -9 to the score.
- Choose from the end, [-2,7,<strong style="user-select: auto;"><u style="user-select: auto;">1</u></strong>], adding 1 * 4 = 4 to the score.
- Choose from the end, [-2,<strong style="user-select: auto;"><u style="user-select: auto;">7</u></strong>], adding 7 * 6 = 42 to the score. 
The total score is 50 + 15 - 9 + 4 + 42 = 102.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == nums.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">m == multipliers.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m &lt;= 10<sup style="user-select: auto;">3</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">m &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code><code style="user-select: auto;"> </code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= nums[i], multipliers[i] &lt;= 1000</code></li>
</ul>
</div>