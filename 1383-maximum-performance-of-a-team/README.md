<h2><a href="https://leetcode.com/problems/maximum-performance-of-a-team/">1383. Maximum Performance of a Team</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two integers <code style="user-select: auto;">n</code> and <code style="user-select: auto;">k</code> and two integer arrays <code style="user-select: auto;">speed</code> and <code style="user-select: auto;">efficiency</code> both of length <code style="user-select: auto;">n</code>. There are <code style="user-select: auto;">n</code> engineers numbered from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. <code style="user-select: auto;">speed[i]</code> and <code style="user-select: auto;">efficiency[i]</code> represent the speed and efficiency of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> engineer respectively.</p>

<p style="user-select: auto;">Choose <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">k</code> different engineers out of the <code style="user-select: auto;">n</code> engineers to form a team with the maximum <strong style="user-select: auto;">performance</strong>.</p>

<p style="user-select: auto;">The performance of a team is the sum of their engineers' speeds multiplied by the minimum efficiency among their engineers.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the maximum performance of this team</em>. Since the answer can be a huge number, return it <strong style="user-select: auto;">modulo</strong> <code style="user-select: auto;">10<sup style="user-select: auto;">9</sup> + 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
<strong style="user-select: auto;">Output:</strong> 60
<strong style="user-select: auto;">Explanation:</strong> 
We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4) and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
<strong style="user-select: auto;">Output:</strong> 68
<strong style="user-select: auto;">Explanation:
</strong>This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5 to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
<strong style="user-select: auto;">Output:</strong> 72
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">speed.length == n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">efficiency.length == n</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= speed[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= efficiency[i] &lt;= 10<sup style="user-select: auto;">8</sup></code></li>
</ul>
</div>