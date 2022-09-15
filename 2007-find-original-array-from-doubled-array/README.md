<h2><a href="https://leetcode.com/problems/find-original-array-from-doubled-array/">2007. Find Original Array From Doubled Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">An integer array <code style="user-select: auto;">original</code> is transformed into a <strong style="user-select: auto;">doubled</strong> array <code style="user-select: auto;">changed</code> by appending <strong style="user-select: auto;">twice the value</strong> of every element in <code style="user-select: auto;">original</code>, and then randomly <strong style="user-select: auto;">shuffling</strong> the resulting array.</p>

<p style="user-select: auto;">Given an array <code style="user-select: auto;">changed</code>, return <code style="user-select: auto;">original</code><em style="user-select: auto;"> if </em><code style="user-select: auto;">changed</code><em style="user-select: auto;"> is a <strong style="user-select: auto;">doubled</strong> array. If </em><code style="user-select: auto;">changed</code><em style="user-select: auto;"> is not a <strong style="user-select: auto;">doubled</strong> array, return an empty array. The elements in</em> <code style="user-select: auto;">original</code> <em style="user-select: auto;">may be returned in <strong style="user-select: auto;">any</strong> order</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> changed = [1,3,4,2,6,8]
<strong style="user-select: auto;">Output:</strong> [1,3,4]
<strong style="user-select: auto;">Explanation:</strong> One possible original array could be [1,3,4]:
- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.
Other original arrays could be [4,3,1] or [3,1,4].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> changed = [6,3,0,1]
<strong style="user-select: auto;">Output:</strong> []
<strong style="user-select: auto;">Explanation:</strong> changed is not a doubled array.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> changed = [1]
<strong style="user-select: auto;">Output:</strong> []
<strong style="user-select: auto;">Explanation:</strong> changed is not a doubled array.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= changed.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= changed[i] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>