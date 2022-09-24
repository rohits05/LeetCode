<h2><a href="https://leetcode.com/problems/path-sum-ii/">113. Path Sum II</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given the <code style="user-select: auto;">root</code> of a binary tree and an integer <code style="user-select: auto;">targetSum</code>, return <em style="user-select: auto;">all <strong style="user-select: auto;">root-to-leaf</strong> paths where the sum of the node values in the path equals </em><code style="user-select: auto;">targetSum</code><em style="user-select: auto;">. Each path should be returned as a list of the node <strong style="user-select: auto;">values</strong>, not node references</em>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">root-to-leaf</strong> path is a path starting from the root and ending at any leaf node. A <strong style="user-select: auto;">leaf</strong> is a node with no children.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsumii1.jpg" style="width: 500px; height: 356px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
<strong style="user-select: auto;">Output:</strong> [[5,4,11,2],[5,8,4,5]]
<strong style="user-select: auto;">Explanation:</strong> There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg" style="width: 212px; height: 181px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2,3], targetSum = 5
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [1,2], targetSum = 0
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[0, 5000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= Node.val &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= targetSum &lt;= 1000</code></li>
</ul>
</div>