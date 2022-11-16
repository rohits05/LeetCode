<h2><a href="https://leetcode.com/problems/guess-number-higher-or-lower/">374. Guess Number Higher or Lower</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">We are playing the Guess Game. The game is as follows:</p>

<p style="user-select: auto;">I pick a number from <code style="user-select: auto;">1</code> to <code style="user-select: auto;">n</code>. You have to guess which number I picked.</p>

<p style="user-select: auto;">Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.</p>

<p style="user-select: auto;">You call a pre-defined API <code style="user-select: auto;">int guess(int num)</code>, which returns three possible results:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">-1</code>: Your guess is higher than the number I picked (i.e. <code style="user-select: auto;">num &gt; pick</code>).</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1</code>: Your guess is lower than the number I picked (i.e. <code style="user-select: auto;">num &lt; pick</code>).</li>
	<li style="user-select: auto;"><code style="user-select: auto;">0</code>: your guess is equal to the number I picked (i.e. <code style="user-select: auto;">num == pick</code>).</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number that I picked</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 10, pick = 6
<strong style="user-select: auto;">Output:</strong> 6
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1, pick = 1
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 2, pick = 1
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= pick &lt;= n</code></li>
</ul>
</div>