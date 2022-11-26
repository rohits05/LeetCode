<h2><a href="https://leetcode.com/problems/maximum-profit-in-job-scheduling/">1235. Maximum Profit in Job Scheduling</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">We have <code style="user-select: auto;">n</code> jobs, where every job is scheduled to be done from <code style="user-select: auto;">startTime[i]</code> to <code style="user-select: auto;">endTime[i]</code>, obtaining a profit of <code style="user-select: auto;">profit[i]</code>.</p>

<p style="user-select: auto;">You're given the <code style="user-select: auto;">startTime</code>, <code style="user-select: auto;">endTime</code> and <code style="user-select: auto;">profit</code> arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.</p>

<p style="user-select: auto;">If you choose a job that ends at time <code style="user-select: auto;">X</code> you will be able to start another job that starts at time <code style="user-select: auto;">X</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2019/10/10/sample1_1584.png" style="width: 380px; height: 154px; user-select: auto;"></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
<strong style="user-select: auto;">Output:</strong> 120
<strong style="user-select: auto;">Explanation:</strong> The subset chosen is the first and fourth job. 
Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2019/10/10/sample22_1584.png" style="width: 600px; height: 112px; user-select: auto;"> </strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
<strong style="user-select: auto;">Output:</strong> 150
<strong style="user-select: auto;">Explanation:</strong> The subset chosen is the first, fourth and fifth job. 
Profit obtained 150 = 20 + 70 + 60.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2019/10/10/sample3_1584.png" style="width: 400px; height: 112px; user-select: auto;"></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
<strong style="user-select: auto;">Output:</strong> 6
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= startTime.length == endTime.length == profit.length &lt;= 5 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= startTime[i] &lt; endTime[i] &lt;= 10<sup style="user-select: auto;">9</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= profit[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>