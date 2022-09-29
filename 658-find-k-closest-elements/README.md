<h2><a href="https://leetcode.com/problems/find-k-closest-elements/">658. Find K Closest Elements</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <strong style="user-select: auto;">sorted</strong> integer array <code style="user-select: auto;">arr</code>, two integers <code style="user-select: auto;">k</code> and <code style="user-select: auto;">x</code>, return the <code style="user-select: auto;">k</code> closest integers to <code style="user-select: auto;">x</code> in the array. The result should also be sorted in ascending order.</p>

<p style="user-select: auto;">An integer <code style="user-select: auto;">a</code> is closer to <code style="user-select: auto;">x</code> than an integer <code style="user-select: auto;">b</code> if:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">|a - x| &lt; |b - x|</code>, or</li>
	<li style="user-select: auto;"><code style="user-select: auto;">|a - x| == |b - x|</code> and <code style="user-select: auto;">a &lt; b</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,2,3,4,5], k = 4, x = 3
<strong style="user-select: auto;">Output:</strong> [1,2,3,4]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> arr = [1,2,3,4,5], k = 4, x = -1
<strong style="user-select: auto;">Output:</strong> [1,2,3,4]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= arr.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= arr.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">arr</code> is sorted in <strong style="user-select: auto;">ascending</strong> order.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt;= arr[i], x &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>