<h2><a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">25. Reverse Nodes in k-Group</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">head</code> of a linked list, reverse the nodes of the list <code style="user-select: auto;">k</code> at a time, and return <em style="user-select: auto;">the modified list</em>.</p>

<p style="user-select: auto;"><code style="user-select: auto;">k</code> is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of <code style="user-select: auto;">k</code> then left-out nodes, in the end, should remain as it is.</p>

<p style="user-select: auto;">You may not alter the values in the list's nodes, only nodes themselves may be changed.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg" style="width: 542px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,2,3,4,5], k = 2
<strong style="user-select: auto;">Output:</strong> [2,1,4,3,5]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg" style="width: 542px; height: 222px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,2,3,4,5], k = 3
<strong style="user-select: auto;">Output:</strong> [3,2,1,4,5]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the list is <code style="user-select: auto;">n</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= n &lt;= 5000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= Node.val &lt;= 1000</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow-up:</strong> Can you solve the problem in <code style="user-select: auto;">O(1)</code> extra memory space?</p>
</div>