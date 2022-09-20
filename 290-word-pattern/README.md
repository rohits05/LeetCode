<h2><a href="https://leetcode.com/problems/word-pattern/">290. Word Pattern</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a <code style="user-select: auto;">pattern</code> and a string <code style="user-select: auto;">s</code>, find if <code style="user-select: auto;">s</code>&nbsp;follows the same pattern.</p>

<p style="user-select: auto;">Here <b style="user-select: auto;">follow</b> means a full match, such that there is a bijection between a letter in <code style="user-select: auto;">pattern</code> and a <b style="user-select: auto;">non-empty</b> word in <code style="user-select: auto;">s</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> pattern = "abba", s = "dog cat cat dog"
<strong style="user-select: auto;">Output:</strong> true
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> pattern = "abba", s = "dog cat cat fish"
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> pattern = "aaaa", s = "dog cat cat dog"
<strong style="user-select: auto;">Output:</strong> false
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= pattern.length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">pattern</code> contains only lower-case English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 3000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains only lowercase English letters and spaces <code style="user-select: auto;">' '</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> <strong style="user-select: auto;">does not contain</strong> any leading or trailing spaces.</li>
	<li style="user-select: auto;">All the words in <code style="user-select: auto;">s</code> are separated by a <strong style="user-select: auto;">single space</strong>.</li>
</ul>
</div>