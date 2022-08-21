<h2><a href="https://leetcode.com/problems/stamping-the-sequence/">936. Stamping The Sequence</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given two strings <code style="user-select: auto;">stamp</code> and <code style="user-select: auto;">target</code>. Initially, there is a string <code style="user-select: auto;">s</code> of length <code style="user-select: auto;">target.length</code> with all <code style="user-select: auto;">s[i] == '?'</code>.</p>

<p style="user-select: auto;">In one turn, you can place <code style="user-select: auto;">stamp</code> over <code style="user-select: auto;">s</code> and replace every letter in the <code style="user-select: auto;">s</code> with the corresponding letter from <code style="user-select: auto;">stamp</code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if <code style="user-select: auto;">stamp = "abc"</code> and <code style="user-select: auto;">target = "abcba"</code>, then <code style="user-select: auto;">s</code> is <code style="user-select: auto;">"?????"</code> initially. In one turn you can:

	<ul style="user-select: auto;">
		<li style="user-select: auto;">place <code style="user-select: auto;">stamp</code> at index <code style="user-select: auto;">0</code> of <code style="user-select: auto;">s</code> to obtain <code style="user-select: auto;">"abc??"</code>,</li>
		<li style="user-select: auto;">place <code style="user-select: auto;">stamp</code> at index <code style="user-select: auto;">1</code> of <code style="user-select: auto;">s</code> to obtain <code style="user-select: auto;">"?abc?"</code>, or</li>
		<li style="user-select: auto;">place <code style="user-select: auto;">stamp</code> at index <code style="user-select: auto;">2</code> of <code style="user-select: auto;">s</code> to obtain <code style="user-select: auto;">"??abc"</code>.</li>
	</ul>
	Note that <code style="user-select: auto;">stamp</code> must be fully contained in the boundaries of <code style="user-select: auto;">s</code> in order to stamp (i.e., you cannot place <code style="user-select: auto;">stamp</code> at index <code style="user-select: auto;">3</code> of <code style="user-select: auto;">s</code>).</li>
</ul>

<p style="user-select: auto;">We want to convert <code style="user-select: auto;">s</code> to <code style="user-select: auto;">target</code> using <strong style="user-select: auto;">at most</strong> <code style="user-select: auto;">10 * target.length</code> turns.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">an array of the index of the left-most letter being stamped at each turn</em>. If we cannot obtain <code style="user-select: auto;">target</code> from <code style="user-select: auto;">s</code> within <code style="user-select: auto;">10 * target.length</code> turns, return an empty array.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stamp = "abc", target = "ababc"
<strong style="user-select: auto;">Output:</strong> [0,2]
<strong style="user-select: auto;">Explanation:</strong> Initially s = "?????".
- Place stamp at index 0 to get "abc??".
- Place stamp at index 2 to get "ababc".
[1,0,2] would also be accepted as an answer, as well as some other answers.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stamp = "abca", target = "aabcaca"
<strong style="user-select: auto;">Output:</strong> [3,0,1]
<strong style="user-select: auto;">Explanation:</strong> Initially s = "???????".
- Place stamp at index 3 to get "???abca".
- Place stamp at index 0 to get "abcabca".
- Place stamp at index 1 to get "aabcaca".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= stamp.length &lt;= target.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">stamp</code> and <code style="user-select: auto;">target</code> consist of lowercase English letters.</li>
</ul>
</div>