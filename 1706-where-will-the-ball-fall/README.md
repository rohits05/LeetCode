<h2><a href="https://leetcode.com/problems/where-will-the-ball-fall/">1706. Where Will the Ball Fall</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You have a 2-D <code style="user-select: auto;">grid</code> of size <code style="user-select: auto;">m x n</code> representing a box, and you have <code style="user-select: auto;">n</code> balls. The box is open on the top and bottom sides.</p>

<p style="user-select: auto;">Each cell in the box has a diagonal board spanning two corners of the cell that can redirect a ball to the right or to the left.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">A board that redirects the ball to the right spans the top-left corner to the bottom-right corner and is represented in the grid as <code style="user-select: auto;">1</code>.</li>
	<li style="user-select: auto;">A board that redirects the ball to the left spans the top-right corner to the bottom-left corner and is represented in the grid as <code style="user-select: auto;">-1</code>.</li>
</ul>

<p style="user-select: auto;">We drop one ball at the top of each column of the box. Each ball can get stuck in the box or fall out of the bottom. A ball gets stuck if it hits a "V" shaped pattern between two boards or if a board redirects the ball into either wall of the box.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> of size </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">answer[i]</code><em style="user-select: auto;"> is the column that the ball falls out of at the bottom after dropping the ball from the </em><code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code><em style="user-select: auto;"> column at the top, or <code style="user-select: auto;">-1</code><em style="user-select: auto;"> if the ball gets stuck in the box</em>.</em></p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<p style="user-select: auto;"><strong style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2019/09/26/ball.jpg" style="width: 500px; height: 385px; user-select: auto;"></strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
<strong style="user-select: auto;">Output:</strong> [1,-1,-1,-1,-1]
<strong style="user-select: auto;">Explanation:</strong> This example is shown in the photo.
Ball b0 is dropped at column 0 and falls out of the box at column 1.
Ball b1 is dropped at column 1 and will get stuck in the box between column 2 and 3 and row 1.
Ball b2 is dropped at column 2 and will get stuck on the box between column 2 and 3 and row 0.
Ball b3 is dropped at column 3 and will get stuck on the box between column 2 and 3 and row 0.
Ball b4 is dropped at column 4 and will get stuck on the box between column 2 and 3 and row 1.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[-1]]
<strong style="user-select: auto;">Output:</strong> [-1]
<strong style="user-select: auto;">Explanation:</strong> The ball gets stuck against the left wall.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]
<strong style="user-select: auto;">Output:</strong> [0,1,2,3,4,-1]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">grid[i][j]</code> is <code style="user-select: auto;">1</code> or <code style="user-select: auto;">-1</code>.</li>
</ul>
</div>