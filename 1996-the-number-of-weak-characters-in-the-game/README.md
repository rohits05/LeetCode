<h2><a href="https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/">1996. The Number of Weak Characters in the Game</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are playing a game that contains multiple characters, and each of the characters has <strong style="user-select: auto;">two</strong> main properties: <strong style="user-select: auto;">attack</strong> and <strong style="user-select: auto;">defense</strong>. You are given a 2D integer array <code style="user-select: auto;">properties</code> where <code style="user-select: auto;">properties[i] = [attack<sub style="user-select: auto;">i</sub>, defense<sub style="user-select: auto;">i</sub>]</code> represents the properties of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> character in the game.</p>

<p style="user-select: auto;">A character is said to be <strong style="user-select: auto;">weak</strong> if any other character has <strong style="user-select: auto;">both</strong> attack and defense levels <strong style="user-select: auto;">strictly greater</strong> than this character's attack and defense levels. More formally, a character <code style="user-select: auto;">i</code> is said to be <strong style="user-select: auto;">weak</strong> if there exists another character <code style="user-select: auto;">j</code> where <code style="user-select: auto;">attack<sub style="user-select: auto;">j</sub> &gt; attack<sub style="user-select: auto;">i</sub></code> and <code style="user-select: auto;">defense<sub style="user-select: auto;">j</sub> &gt; defense<sub style="user-select: auto;">i</sub></code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of <strong style="user-select: auto;">weak</strong> characters</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> properties = [[5,5],[6,3],[3,6]]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> No character has strictly greater attack and defense than the other.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> properties = [[2,2],[3,3]]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The first character is weak because the second character has a strictly greater attack and defense.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> properties = [[1,5],[10,4],[4,3]]
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation:</strong> The third character is weak because the second character has a strictly greater attack and defense.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">2 &lt;= properties.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">properties[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= attack<sub style="user-select: auto;">i</sub>, defense<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>