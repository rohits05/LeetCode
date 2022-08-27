<h2><a href="https://leetcode.com/problems/frog-jump/">403. Frog Jump</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A frog is crossing a river. The river is divided into some number of units, and at each unit, there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.</p>

<p style="user-select: auto;">Given a list of <code style="user-select: auto;">stones</code>' positions (in units) in sorted <strong style="user-select: auto;">ascending order</strong>, determine if the frog can cross the river by landing on the last stone. Initially, the frog is on the first stone and assumes the first jump must be <code style="user-select: auto;">1</code> unit.</p>

<p style="user-select: auto;">If the frog's last jump was <code style="user-select: auto;">k</code> units, its next jump must be either <code style="user-select: auto;">k - 1</code>, <code style="user-select: auto;">k</code>, or <code style="user-select: auto;">k + 1</code> units. The frog can only jump in the forward direction.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stones = [0,1,3,5,6,8,12,17]
<strong style="user-select: auto;">Output:</strong> true
<strong style="user-select: auto;">Explanation:</strong> The frog can jump to the last stone by jumping 1 unit to the 2nd stone, then 2 units to the 3rd stone, then 2 units to the 4th stone, then 3 units to the 6th stone, 4 units to the 7th stone, and 5 units to the 8th stone.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stones = [0,1,2,3,4,8,9,11]
<strong style="user-select: auto;">Output:</strong> false
<strong style="user-select: auto;">Explanation:</strong> There is no way to jump to the last stone as the gap between the 5th and 6th stone is too large.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= stones.length &lt;= 2000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= stones[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">stones[0] == 0</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">stones</code>&nbsp;is sorted in a strictly increasing order.</li>
</ul>
</div>