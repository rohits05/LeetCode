<h2><a href="https://leetcode.com/problems/word-search-ii/">212. Word Search II</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an <code style="user-select: auto;">m x n</code> <code style="user-select: auto;">board</code>&nbsp;of characters and a list of strings <code style="user-select: auto;">words</code>, return <em style="user-select: auto;">all words on the board</em>.</p>

<p style="user-select: auto;">Each word must be constructed from letters of sequentially adjacent cells, where <strong style="user-select: auto;">adjacent cells</strong> are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/07/search1.jpg" style="width: 322px; height: 322px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
<strong style="user-select: auto;">Output:</strong> ["eat","oath"]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/07/search2.jpg" style="width: 162px; height: 162px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = [["a","b"],["c","d"]], words = ["abcb"]
<strong style="user-select: auto;">Output:</strong> []
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == board.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == board[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 12</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i][j]</code> is a lowercase English letter.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 3 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</li>
	<li style="user-select: auto;">All the strings of <code style="user-select: auto;">words</code> are unique.</li>
</ul>
</div>