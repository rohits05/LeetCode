<h2><a href="https://leetcode.com/problems/string-compression-ii/">1531. String Compression II</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;"><a href="http://en.wikipedia.org/wiki/Run-length_encoding" style="user-select: auto;">Run-length encoding</a> is a string compression method that works by&nbsp;replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string&nbsp;<code style="user-select: auto;">"aabccc"</code>&nbsp;we replace <font face="monospace" style="user-select: auto;"><code style="user-select: auto;">"aa"</code></font>&nbsp;by&nbsp;<font face="monospace" style="user-select: auto;"><code style="user-select: auto;">"a2"</code></font>&nbsp;and replace <font face="monospace" style="user-select: auto;"><code style="user-select: auto;">"ccc"</code></font>&nbsp;by&nbsp;<font face="monospace" style="user-select: auto;"><code style="user-select: auto;">"c3"</code></font>. Thus the compressed string becomes <font face="monospace" style="user-select: auto;"><code style="user-select: auto;">"a2bc3"</code>.</font></p>

<p style="user-select: auto;">Notice that in this problem, we are not adding&nbsp;<code style="user-select: auto;">'1'</code>&nbsp;after single characters.</p>

<p style="user-select: auto;">Given a&nbsp;string <code style="user-select: auto;">s</code>&nbsp;and an integer <code style="user-select: auto;">k</code>. You need to delete <strong style="user-select: auto;">at most</strong>&nbsp;<code style="user-select: auto;">k</code> characters from&nbsp;<code style="user-select: auto;">s</code>&nbsp;such that the run-length encoded version of <code style="user-select: auto;">s</code>&nbsp;has minimum length.</p>

<p style="user-select: auto;">Find the <em style="user-select: auto;">minimum length of the run-length encoded&nbsp;version of </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> after deleting at most </em><code style="user-select: auto;">k</code><em style="user-select: auto;"> characters</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aaabcccd", k = 2
<strong style="user-select: auto;">Output:</strong> 4
<b style="user-select: auto;">Explanation: </b>Compressing s without deleting anything will give us "a3bc3d" of length 6. Deleting any of the characters 'a' or 'c' would at most decrease the length of the compressed string to 5, for instance delete 2 'a' then we will have s = "abcccd" which compressed is abc3d. Therefore, the optimal way is to delete 'b' and 'd', then the compressed version of s will be "a3c3" of length 4.</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aabbaa", k = 2
<strong style="user-select: auto;">Output:</strong> 2
<b style="user-select: auto;">Explanation: </b>If we delete both 'b' characters, the resulting compressed string would be "a4" of length 2.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aaaaaaaaaaa", k = 0
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation: </strong>Since k is zero, we cannot delete anything. The compressed string is "a11" of length 3.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= k &lt;= s.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains only lowercase English letters.</li>
</ul>
</div>