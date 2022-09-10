<h2><a href="https://leetcode.com/problems/insert-interval/">57. Insert Interval</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array of non-overlapping intervals <code style="user-select: auto;">intervals</code> where <code style="user-select: auto;">intervals[i] = [start<sub style="user-select: auto;">i</sub>, end<sub style="user-select: auto;">i</sub>]</code> represent the start and the end of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> interval and <code style="user-select: auto;">intervals</code> is sorted in ascending order by <code style="user-select: auto;">start<sub style="user-select: auto;">i</sub></code>. You are also given an interval <code style="user-select: auto;">newInterval = [start, end]</code> that represents the start and end of another interval.</p>

<p style="user-select: auto;">Insert <code style="user-select: auto;">newInterval</code> into <code style="user-select: auto;">intervals</code> such that <code style="user-select: auto;">intervals</code> is still sorted in ascending order by <code style="user-select: auto;">start<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">intervals</code> still does not have any overlapping intervals (merge overlapping intervals if necessary).</p>

<p style="user-select: auto;">Return <code style="user-select: auto;">intervals</code><em style="user-select: auto;"> after the insertion</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> intervals = [[1,3],[6,9]], newInterval = [2,5]
<strong style="user-select: auto;">Output:</strong> [[1,5],[6,9]]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
<strong style="user-select: auto;">Output:</strong> [[1,2],[3,10],[12,16]]
<strong style="user-select: auto;">Explanation:</strong> Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= intervals.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">intervals[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= start<sub style="user-select: auto;">i</sub> &lt;= end<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">intervals</code> is sorted by <code style="user-select: auto;">start<sub style="user-select: auto;">i</sub></code> in <strong style="user-select: auto;">ascending</strong> order.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">newInterval.length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= start &lt;= end &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>