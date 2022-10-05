<h2><a href="https://leetcode.com/problems/add-one-row-to-tree/">623. Add One Row to Tree</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree and two integers <code style="user-select: auto;">val</code> and <code style="user-select: auto;">depth</code>, add a row of nodes with value <code style="user-select: auto;">val</code> at the given depth <code style="user-select: auto;">depth</code>.</p>

<p style="user-select: auto;">Note that the <code style="user-select: auto;">root</code> node is at depth <code style="user-select: auto;">1</code>.</p>

<p style="user-select: auto;">The adding rule is:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Given the integer <code style="user-select: auto;">depth</code>, for each not null tree node <code style="user-select: auto;">cur</code> at the depth <code style="user-select: auto;">depth - 1</code>, create two tree nodes with value <code style="user-select: auto;">val</code> as <code style="user-select: auto;">cur</code>'s left subtree root and right subtree root.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">cur</code>'s original left subtree should be the left subtree of the new left subtree root.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">cur</code>'s original right subtree should be the right subtree of the new right subtree root.</li>
	<li style="user-select: auto;">If <code style="user-select: auto;">depth == 1</code> that means there is no depth <code style="user-select: auto;">depth - 1</code> at all, then create a tree node with value <code style="user-select: auto;">val</code> as the new root of the whole original tree, and the original tree is the new root's left subtree.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/15/addrow-tree.jpg" style="width: 500px; height: 231px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [4,2,6,3,1,5], val = 1, depth = 2
<strong style="user-select: auto;">Output:</strong> [4,1,1,2,null,null,6,3,1,5]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/11/add2-tree.jpg" style="width: 500px; height: 277px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [4,2,null,3,1], val = 1, depth = 3
<strong style="user-select: auto;">Output:</strong> [4,2,null,1,1,3,null,null,1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;">The depth of the tree is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-100 &lt;= Node.val &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= depth &lt;= the depth of tree + 1</code></li>
</ul>
</div>