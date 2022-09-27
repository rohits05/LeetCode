<h2><a href="https://leetcode.com/problems/delete-node-in-a-bst/">450. Delete Node in a BST</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return <em style="user-select: auto;">the <strong style="user-select: auto;">root node reference</strong> (possibly updated) of the BST</em>.</p>

<p style="user-select: auto;">Basically, the deletion can be divided into two stages:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Search for a node to remove.</li>
	<li style="user-select: auto;">If the node is found, delete the node.</li>
</ol>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg" style="width: 800px; height: 214px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,3,6,2,4,null,7], key = 3
<strong style="user-select: auto;">Output:</strong> [5,4,6,2,null,null,7]
<strong style="user-select: auto;">Explanation:</strong> Given key to delete is 3. So we find the node with value 3 and delete it.
One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg" style="width: 350px; height: 255px; user-select: auto;">
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [5,3,6,2,4,null,7], key = 0
<strong style="user-select: auto;">Output:</strong> [5,3,6,2,4,null,7]
<strong style="user-select: auto;">Explanation:</strong> The tree does not contain a node with value = 0.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> root = [], key = 0
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the tree is in the range <code style="user-select: auto;">[0, 10<sup style="user-select: auto;">4</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= Node.val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">Each node has a <strong style="user-select: auto;">unique</strong> value.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">root</code> is a valid binary search tree.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">5</sup> &lt;= key &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong> Could you solve it with time complexity <code style="user-select: auto;">O(height of tree)</code>?</p>
</div>