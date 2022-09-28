<h2><a href="https://leetcode.com/problems/keys-and-rooms/">841. Keys and Rooms</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> rooms labeled from <code style="user-select: auto;">0</code> to <code style="user-select: auto;">n - 1</code>&nbsp;and all the rooms are locked except for room <code style="user-select: auto;">0</code>. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.</p>

<p style="user-select: auto;">When you visit a room, you may find a set of <strong style="user-select: auto;">distinct keys</strong> in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.</p>

<p style="user-select: auto;">Given an array <code style="user-select: auto;">rooms</code> where <code style="user-select: auto;">rooms[i]</code> is the set of keys that you can obtain if you visited room <code style="user-select: auto;">i</code>, return <code style="user-select: auto;">true</code> <em style="user-select: auto;">if you can visit <strong style="user-select: auto;">all</strong> the rooms, or</em> <code style="user-select: auto;">false</code> <em style="user-select: auto;">otherwise</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> rooms = [[1],[2],[3],[]]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> 
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> rooms = [[1,3],[3,0,1],[2],[0]]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> We can not enter room number 2 since the only key that unlocks it is in that room.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == rooms.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= n &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= rooms[i].length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= sum(rooms[i].length) &lt;= 3000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= rooms[i][j] &lt; n</code></li>
	<li style="user-select: auto;">All the values of <code style="user-select: auto;">rooms[i]</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>