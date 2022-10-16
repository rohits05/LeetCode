<h2><a href="https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/">1335. Minimum Difficulty of a Job Schedule</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You want to schedule a list of jobs in <code style="user-select: auto;">d</code> days. Jobs are dependent (i.e To work on the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> job, you have to finish all the jobs <code style="user-select: auto;">j</code> where <code style="user-select: auto;">0 &lt;= j &lt; i</code>).</p>

<p style="user-select: auto;">You have to finish <strong style="user-select: auto;">at least</strong> one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the <code style="user-select: auto;">d</code> days. The difficulty of a day is the maximum difficulty of a job done on that day.</p>

<p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">jobDifficulty</code> and an integer <code style="user-select: auto;">d</code>. The difficulty of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> job is <code style="user-select: auto;">jobDifficulty[i]</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the minimum difficulty of a job schedule</em>. If you cannot find a schedule for the jobs return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/01/16/untitled.png" style="width: 365px; height: 370px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> jobDifficulty = [6,5,4,3,2,1], d = 2
<strong style="user-select: auto;">Output:</strong> 7
<strong style="user-select: auto;">Explanation:</strong> First day you can finish the first 5 jobs, total difficulty = 6.
Second day you can finish the last job, total difficulty = 1.
The difficulty of the schedule = 6 + 1 = 7 
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> jobDifficulty = [9,9,9], d = 4
<strong style="user-select: auto;">Output:</strong> -1
<strong style="user-select: auto;">Explanation:</strong> If you finish a job per day you will still have a free day. you cannot find a schedule for the given jobs.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> jobDifficulty = [1,1,1], d = 3
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> The schedule is one job per day. total difficulty will be 3.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= jobDifficulty.length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= jobDifficulty[i] &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= d &lt;= 10</code></li>
</ul>
</div>