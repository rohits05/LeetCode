<h2><a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">237. Delete Node in a Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is a singly-linked list <code style="user-select: auto;">head</code> and we want to delete a node <code style="user-select: auto;">node</code> in it.</p>

<p style="user-select: auto;">You are given the node to be deleted <code style="user-select: auto;">node</code>. You will <strong style="user-select: auto;">not be given access</strong> to the first node of <code style="user-select: auto;">head</code>.</p>

<p style="user-select: auto;">All the values of the linked list are <strong style="user-select: auto;">unique</strong>, and it is guaranteed that the given node <code style="user-select: auto;">node</code> is not the last node in the linked list.</p>

<p style="user-select: auto;">Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The value of the given node should not exist in the linked list.</li>
	<li style="user-select: auto;">The number of nodes in the linked list should decrease by one.</li>
	<li style="user-select: auto;">All the values before <code style="user-select: auto;">node</code> should be in the same order.</li>
	<li style="user-select: auto;">All the values after <code style="user-select: auto;">node</code> should be in the same order.</li>
</ul>

<p style="user-select: auto;"><strong style="user-select: auto;">Custom testing:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For the input, you should provide the entire linked list <code style="user-select: auto;">head</code> and the node to be given <code style="user-select: auto;">node</code>. <code style="user-select: auto;">node</code> should not be the last node of the list and should be an actual node in the list.</li>
	<li style="user-select: auto;">We will build the linked list and pass the node to your function.</li>
	<li style="user-select: auto;">The output will be the entire list after calling your function.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/01/node1.jpg" style="width: 400px; height: 286px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [4,5,1,9], node = 5
<strong style="user-select: auto;">Output:</strong> [4,1,9]
<strong style="user-select: auto;">Explanation: </strong>You are given the second node with value 5, the linked list should become 4 -&gt; 1 -&gt; 9 after calling your function.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/01/node2.jpg" style="width: 400px; height: 315px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [4,5,1,9], node = 1
<strong style="user-select: auto;">Output:</strong> [4,5,9]
<strong style="user-select: auto;">Explanation: </strong>You are given the third node with value 1, the linked list should become 4 -&gt; 5 -&gt; 9 after calling your function.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of the nodes in the given list is in the range <code style="user-select: auto;">[2, 1000]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">-1000 &lt;= Node.val &lt;= 1000</code></li>
	<li style="user-select: auto;">The value of each node in the list is <strong style="user-select: auto;">unique</strong>.</li>
	<li style="user-select: auto;">The <code style="user-select: auto;">node</code> to be deleted is <strong style="user-select: auto;">in the list</strong> and is <strong style="user-select: auto;">not a tail</strong> node.</li>
</ul>
</div>