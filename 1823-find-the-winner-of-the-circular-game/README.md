<h2><a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game/">1823. Find the Winner of the Circular Game</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> friends that are playing a game. The friends are sitting in a circle and are numbered from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code> in <strong style="user-select: auto;">clockwise order</strong>. More formally, moving clockwise from the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> friend brings you to the <code style="user-select: auto;">(i+1)<sup style="user-select: auto;">th</sup></code> friend for <code style="user-select: auto;">1 &lt;= i &lt; n</code>, and moving clockwise from the <code style="user-select: auto;">n<sup style="user-select: auto;">th</sup></code> friend brings you to the <code style="user-select: auto;">1<sup style="user-select: auto;">st</sup></code> friend.</p>

<p style="user-select: auto;">The rules of the game are as follows:</p>

<ol style="user-select: auto;">
	<li style="user-select: auto;"><strong style="user-select: auto;">Start</strong> at the <code style="user-select: auto;">1<sup style="user-select: auto;">st</sup></code> friend.</li>
	<li style="user-select: auto;">Count the next <code style="user-select: auto;">k</code> friends in the clockwise direction <strong style="user-select: auto;">including</strong> the friend you started at. The counting wraps around the circle and may count some friends more than once.</li>
	<li style="user-select: auto;">The last friend you counted leaves the circle and loses the game.</li>
	<li style="user-select: auto;">If there is still more than one friend in the circle, go back to step <code style="user-select: auto;">2</code> <strong style="user-select: auto;">starting</strong> from the friend <strong style="user-select: auto;">immediately clockwise</strong> of the friend who just lost and repeat.</li>
	<li style="user-select: auto;">Else, the last friend in the circle wins the game.</li>
</ol>

<p style="user-select: auto;">Given the number of friends, <code style="user-select: auto;">n</code>, and an integer <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the winner of the game</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/25/ic234-q2-ex11.png" style="width: 500px; height: 345px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 5, k = 2
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> Here are the steps of the game:
1) Start at friend 1.
2) Count 2 friends clockwise, which are friends 1 and 2.
3) Friend 2 leaves the circle. Next start is friend 3.
4) Count 2 friends clockwise, which are friends 3 and 4.
5) Friend 4 leaves the circle. Next start is friend 5.
6) Count 2 friends clockwise, which are friends 5 and 1.
7) Friend 1 leaves the circle. Next start is friend 3.
8) Count 2 friends clockwise, which are friends 3 and 5.
9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 6, k = 5
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= n &lt;= 500</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong></p>

<p style="user-select: auto;">Could you solve this problem in linear time with constant space?</p>
</div>