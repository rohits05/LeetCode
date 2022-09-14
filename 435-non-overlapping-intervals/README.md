<h2><a href="https://leetcode.com/problems/non-overlapping-intervals/">435. Non-overlapping Intervals</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of intervals <code style="user-select: auto;">intervals</code> where <code style="user-select: auto;">intervals[i] = [start<sub style="user-select: auto;">i</sub>, end<sub style="user-select: auto;">i</sub>]</code>, return <em style="user-select: auto;">the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> intervals = [[1,2],[2,3],[3,4],[1,3]]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> [1,3] can be removed and the rest of the intervals are non-overlapping.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> intervals = [[1,2],[1,2],[1,2]]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> You need to remove two [1,2] to make the rest of the intervals non-overlapping.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> intervals = [[1,2],[2,3]]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> You don't need to remove any of the intervals since they're already non-overlapping.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= intervals.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">intervals[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-5 * 10<sup style="user-select: auto;">4</sup> &lt;= start<sub style="user-select: auto;">i</sub> &lt; end<sub style="user-select: auto;">i</sub> &lt;= 5 * 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>