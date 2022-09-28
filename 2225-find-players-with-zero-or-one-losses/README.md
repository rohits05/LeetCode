<h2><a href="https://leetcode.com/problems/find-players-with-zero-or-one-losses/">2225. Find Players With Zero or One Losses</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an integer array <code style="user-select: auto;">matches</code> where <code style="user-select: auto;">matches[i] = [winner<sub style="user-select: auto;">i</sub>, loser<sub style="user-select: auto;">i</sub>]</code> indicates that the player <code style="user-select: auto;">winner<sub style="user-select: auto;">i</sub></code> defeated player <code style="user-select: auto;">loser<sub style="user-select: auto;">i</sub></code> in a match.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a list </em><code style="user-select: auto;">answer</code><em style="user-select: auto;"> of size </em><code style="user-select: auto;">2</code><em style="user-select: auto;"> where:</em></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">answer[0]</code> is a list of all players that have <strong style="user-select: auto;">not</strong> lost any matches.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">answer[1]</code> is a list of all players that have lost exactly <strong style="user-select: auto;">one</strong> match.</li>
</ul>

<p style="user-select: auto;">The values in the two lists should be returned in <strong style="user-select: auto;">increasing</strong> order.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">You should only consider the players that have played <strong style="user-select: auto;">at least one</strong> match.</li>
	<li style="user-select: auto;">The testcases will be generated such that <strong style="user-select: auto;">no</strong> two matches will have the <strong style="user-select: auto;">same</strong> outcome.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
<strong style="user-select: auto;">Output:</strong> [[1,2,10],[4,5,7,8]]
<strong style="user-select: auto;">Explanation:</strong>
Players 1, 2, and 10 have not lost any matches.
Players 4, 5, 7, and 8 each have lost one match.
Players 3, 6, and 9 each have lost two matches.
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> matches = [[2,3],[1,3],[5,4],[6,4]]
<strong style="user-select: auto;">Output:</strong> [[1,2,5,6],[]]
<strong style="user-select: auto;">Explanation:</strong>
Players 1, 2, 5, and 6 have not lost any matches.
Players 3 and 4 each have lost two matches.
Thus, answer[0] = [1,2,5,6] and answer[1] = [].
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= matches.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">matches[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= winner<sub style="user-select: auto;">i</sub>, loser<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">winner<sub style="user-select: auto;">i</sub> != loser<sub style="user-select: auto;">i</sub></code></li>
	<li style="user-select: auto;">All <code style="user-select: auto;">matches[i]</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>