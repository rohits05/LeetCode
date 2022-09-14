<h2><a href="https://leetcode.com/problems/pascals-triangle-ii/">119. Pascal's Triangle II</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer <code style="user-select: auto;">rowIndex</code>, return the <code style="user-select: auto;">rowIndex<sup style="user-select: auto;">th</sup></code> (<strong style="user-select: auto;">0-indexed</strong>) row of the <strong style="user-select: auto;">Pascal's triangle</strong>.</p>

<p style="user-select: auto;">In <strong style="user-select: auto;">Pascal's triangle</strong>, each number is the sum of the two numbers directly above it as shown:</p>
<img alt="" src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif" style="height: 240px; width: 260px; user-select: auto;">
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> rowIndex = 3
<strong style="user-select: auto;">Output:</strong> [1,3,3,1]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> rowIndex = 0
<strong style="user-select: auto;">Output:</strong> [1]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> rowIndex = 1
<strong style="user-select: auto;">Output:</strong> [1,1]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= rowIndex &lt;= 33</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong> Could you optimize your algorithm to use only <code style="user-select: auto;">O(rowIndex)</code> extra space?</p>
</div>