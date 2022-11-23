<h2><a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Determine if a&nbsp;<code style="user-select: auto;">9 x 9</code> Sudoku board&nbsp;is valid.&nbsp;Only the filled cells need to be validated&nbsp;<strong style="user-select: auto;">according to the following rules</strong>:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Each row&nbsp;must contain the&nbsp;digits&nbsp;<code style="user-select: auto;">1-9</code> without repetition.</li>
	<li style="user-select: auto;">Each column must contain the digits&nbsp;<code style="user-select: auto;">1-9</code>&nbsp;without repetition.</li>
	<li style="user-select: auto;">Each of the nine&nbsp;<code style="user-select: auto;">3 x 3</code> sub-boxes of the grid must contain the digits&nbsp;<code style="user-select: auto;">1-9</code>&nbsp;without repetition.</li>
</ol>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">A Sudoku board (partially filled) could be valid but is not necessarily solvable.</li>
	<li style="user-select: auto;">Only the filled cells need to be validated according to the mentioned&nbsp;rules.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height: 250px; width: 250px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong style="user-select: auto;">Output:</strong> true
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> Same as Example 1, except with the <strong style="user-select: auto;">5</strong> in the top left corner being modified to <strong style="user-select: auto;">8</strong>. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">board.length == 9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i].length == 9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i][j]</code> is a digit <code style="user-select: auto;">1-9</code> or <code style="user-select: auto;">'.'</code>.</li>
</ul>
</div>