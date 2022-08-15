<h2><a href="https://leetcode.com/problems/add-two-numbers-ii/">445. Add Two Numbers II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two <strong style="user-select: auto;">non-empty</strong> linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.</p>

<p style="user-select: auto;">You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/09/sumii-linked-list.jpg" style="width: 523px; height: 342px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> l1 = [7,2,4,3], l2 = [5,6,4]
<strong style="user-select: auto;">Output:</strong> [7,8,0,7]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
<strong style="user-select: auto;">Output:</strong> [8,0,7]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> l1 = [0], l2 = [0]
<strong style="user-select: auto;">Output:</strong> [0]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in each linked list is in the range <code style="user-select: auto;">[1, 100]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= Node.val &lt;= 9</code></li>
	<li style="user-select: auto;">It is guaranteed that the list represents a number that does not have leading zeros.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong>&nbsp;Could you solve it without reversing the input lists?</p>
</div>