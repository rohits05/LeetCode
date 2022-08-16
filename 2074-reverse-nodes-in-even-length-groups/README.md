<h2><a href="https://leetcode.com/problems/reverse-nodes-in-even-length-groups/">2074. Reverse Nodes in Even Length Groups</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given the <code style="user-select: auto;">head</code> of a linked list.</p>

<p style="user-select: auto;">The nodes in the linked list are <strong style="user-select: auto;">sequentially</strong> assigned to <strong style="user-select: auto;">non-empty</strong> groups whose lengths form the sequence of the natural numbers (<code style="user-select: auto;">1, 2, 3, 4, ...</code>). The <strong style="user-select: auto;">length</strong> of a group is the number of nodes assigned to it. In other words,</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The <code style="user-select: auto;">1<sup style="user-select: auto;">st</sup></code> node is assigned to the first group.</li>
	<li style="user-select: auto;">The <code style="user-select: auto;">2<sup style="user-select: auto;">nd</sup></code> and the <code style="user-select: auto;">3<sup style="user-select: auto;">rd</sup></code> nodes are assigned to the second group.</li>
	<li style="user-select: auto;">The <code style="user-select: auto;">4<sup style="user-select: auto;">th</sup></code>, <code style="user-select: auto;">5<sup style="user-select: auto;">th</sup></code>, and <code style="user-select: auto;">6<sup style="user-select: auto;">th</sup></code> nodes are assigned to the third group, and so on.</li>
</ul>

<p style="user-select: auto;">Note that the length of the last group may be less than or equal to <code style="user-select: auto;">1 + the length of the second to last group</code>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Reverse</strong> the nodes in each group with an <strong style="user-select: auto;">even</strong> length, and return <em style="user-select: auto;">the</em> <code style="user-select: auto;">head</code> <em style="user-select: auto;">of the modified linked list</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/10/25/eg1.png" style="width: 699px; height: 124px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [5,2,6,3,9,1,7,3,8,4]
<strong style="user-select: auto;">Output:</strong> [5,6,2,3,9,1,4,8,3,7]
<strong style="user-select: auto;">Explanation:</strong>
- The length of the first group is 1, which is odd, hence no reversal occurs.
- The length of the second group is 2, which is even, hence the nodes are reversed.
- The length of the third group is 3, which is odd, hence no reversal occurs.
- The length of the last group is 4, which is even, hence the nodes are reversed.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/10/25/eg2.png" style="width: 284px; height: 114px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,1,0,6]
<strong style="user-select: auto;">Output:</strong> [1,0,1,6]
<strong style="user-select: auto;">Explanation:</strong>
- The length of the first group is 1. No reversal occurs.
- The length of the second group is 2. The nodes are reversed.
- The length of the last group is 1. No reversal occurs.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/11/17/ex3.png" style="width: 348px; height: 114px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> head = [1,1,0,6,5]
<strong style="user-select: auto;">Output:</strong> [1,0,1,5,6]
<strong style="user-select: auto;">Explanation:</strong>
- The length of the first group is 1. No reversal occurs.
- The length of the second group is 2. The nodes are reversed.
- The length of the last group is 2. The nodes are reversed.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">The number of nodes in the list is in the range <code style="user-select: auto;">[1, 10<sup style="user-select: auto;">5</sup>]</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= Node.val &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>