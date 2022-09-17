<h2><a href="https://leetcode.com/problems/palindrome-pairs/">336. Palindrome Pairs</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a list of <b style="user-select: auto;">unique</b> words, return all the pairs of the&nbsp;<b style="user-select: auto;"><i style="user-select: auto;">distinct</i></b> indices <code style="user-select: auto;">(i, j)</code> in the given list, so that the concatenation of the two words&nbsp;<code style="user-select: auto;">words[i] + words[j]</code> is a palindrome.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["abcd","dcba","lls","s","sssll"]
<strong style="user-select: auto;">Output:</strong> [[0,1],[1,0],[3,2],[2,4]]
<strong style="user-select: auto;">Explanation:</strong> The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["bat","tab","cat"]
<strong style="user-select: auto;">Output:</strong> [[0,1],[1,0]]
<strong style="user-select: auto;">Explanation:</strong> The palindromes are ["battab","tabbat"]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["a",""]
<strong style="user-select: auto;">Output:</strong> [[0,1],[1,0]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 5000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= words[i].length &lt;= 300</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lower-case English letters.</li>
</ul>
</div>