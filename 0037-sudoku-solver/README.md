<h2><a href="https://leetcode.com/problems/sudoku-solver/">37. Sudoku Solver</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Write a program to solve a Sudoku puzzle by filling the empty cells.</p>

<p style="user-select: auto;">A sudoku solution must satisfy <strong style="user-select: auto;">all of the following rules</strong>:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;">Each of the digits <code style="user-select: auto;">1-9</code> must occur exactly once in each row.</li>
	<li style="user-select: auto;">Each of the digits <code style="user-select: auto;">1-9</code> must occur exactly once in each column.</li>
	<li style="user-select: auto;">Each of the digits <code style="user-select: auto;">1-9</code> must occur exactly once in each of the 9 <code style="user-select: auto;">3x3</code> sub-boxes of the grid.</li>
</ol>

<p style="user-select: auto;">The <code style="user-select: auto;">'.'</code> character indicates empty cells.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height: 250px; width: 250px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
<strong style="user-select: auto;">Output:</strong> [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
<strong style="user-select: auto;">Explanation:</strong>&nbsp;The input board is shown above and the only valid solution is shown below:

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png" style="height: 250px; width: 250px; user-select: auto;">
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">board.length == 9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i].length == 9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">board[i][j]</code> is a digit or <code style="user-select: auto;">'.'</code>.</li>
	<li style="user-select: auto;">It is <strong style="user-select: auto;">guaranteed</strong> that the input board has only one solution.</li>
</ul>
</div>