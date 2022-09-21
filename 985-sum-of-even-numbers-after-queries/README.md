<h2><a href="https://leetcode.com/problems/sum-of-even-numbers-after-queries/">985. Sum of Even Numbers After Queries</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">nums</code> and an array <code style="user-select: auto;">queries</code> where <code style="user-select: auto;">queries[i] = [val<sub style="user-select: auto;">i</sub>, index<sub style="user-select: auto;">i</sub>]</code>.</p>

<p style="user-select: auto;">For each query <code style="user-select: auto;">i</code>, first, apply <code style="user-select: auto;">nums[index<sub style="user-select: auto;">i</sub>] = nums[index<sub style="user-select: auto;">i</sub>] + val<sub style="user-select: auto;">i</sub></code>, then print the sum of the even values of <code style="user-select: auto;">nums</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an integer array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the answer to the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> query</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
<strong style="user-select: auto;">Output:</strong> [8,6,2,4]
<strong style="user-select: auto;">Explanation:</strong> At the beginning, the array is [1,2,3,4].
After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1], queries = [[4,0]]
<strong style="user-select: auto;">Output:</strong> [0]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= queries.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= val<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= index<sub style="user-select: auto;">i</sub> &lt; nums.length</code></li>
</ul>
</div>