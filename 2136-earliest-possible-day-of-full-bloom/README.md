<h2><a href="https://leetcode.com/problems/earliest-possible-day-of-full-bloom/">2136. Earliest Possible Day of Full Bloom</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You have <code style="user-select: auto;">n</code> flower seeds. Every seed must be planted first before it can begin to grow, then bloom. Planting a seed takes time and so does the growth of a seed. You are given two <strong style="user-select: auto;">0-indexed</strong> integer arrays <code style="user-select: auto;">plantTime</code> and <code style="user-select: auto;">growTime</code>, of length <code style="user-select: auto;">n</code> each:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">plantTime[i]</code> is the number of <strong style="user-select: auto;">full days</strong> it takes you to <strong style="user-select: auto;">plant</strong> the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> seed. Every day, you can work on planting exactly one seed. You <strong style="user-select: auto;">do not</strong> have to work on planting the same seed on consecutive days, but the planting of a seed is not complete <strong style="user-select: auto;">until</strong> you have worked <code style="user-select: auto;">plantTime[i]</code> days on planting it in total.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">growTime[i]</code> is the number of <strong style="user-select: auto;">full days</strong> it takes the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> seed to grow after being completely planted. <strong style="user-select: auto;">After</strong> the last day of its growth, the flower <strong style="user-select: auto;">blooms</strong> and stays bloomed forever.</li>
</ul>

<p style="user-select: auto;">From the beginning of day <code style="user-select: auto;">0</code>, you can plant the seeds in <strong style="user-select: auto;">any</strong> order.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">earliest</strong> possible day where <strong style="user-select: auto;">all</strong> seeds are blooming</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/12/21/1.png" style="width: 453px; height: 149px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> plantTime = [1,4,3], growTime = [2,3,1]
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong> The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
One optimal way is:
On day 0, plant the 0<sup style="user-select: auto;">th</sup> seed. The seed grows for 2 full days and blooms on day 3.
On days 1, 2, 3, and 4, plant the 1<sup style="user-select: auto;">st</sup> seed. The seed grows for 3 full days and blooms on day 8.
On days 5, 6, and 7, plant the 2<sup style="user-select: auto;">nd</sup> seed. The seed grows for 1 full day and blooms on day 9.
Thus, on day 9, all the seeds are blooming.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/12/21/2.png" style="width: 454px; height: 184px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> plantTime = [1,2,3,2], growTime = [2,1,2,1]
<strong style="user-select: auto;">Output:</strong> 9
<strong style="user-select: auto;">Explanation:</strong> The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
One optimal way is:
On day 1, plant the 0<sup style="user-select: auto;">th</sup> seed. The seed grows for 2 full days and blooms on day 4.
On days 0 and 3, plant the 1<sup style="user-select: auto;">st</sup> seed. The seed grows for 1 full day and blooms on day 5.
On days 2, 4, and 5, plant the 2<sup style="user-select: auto;">nd</sup> seed. The seed grows for 2 full days and blooms on day 8.
On days 6 and 7, plant the 3<sup style="user-select: auto;">rd</sup> seed. The seed grows for 1 full day and blooms on day 9.
Thus, on day 9, all the seeds are blooming.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> plantTime = [1], growTime = [1]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> On day 0, plant the 0<sup style="user-select: auto;">th</sup> seed. The seed grows for 1 full day and blooms on day 2.
Thus, on day 2, all the seeds are blooming.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == plantTime.length == growTime.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= plantTime[i], growTime[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>