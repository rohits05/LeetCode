<h2><a href="https://leetcode.com/problems/break-a-palindrome/">1328. Break a Palindrome</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a palindromic string of lowercase English letters <code style="user-select: auto;">palindrome</code>, replace <strong style="user-select: auto;">exactly one</strong> character with any lowercase English letter so that the resulting string is <strong style="user-select: auto;">not</strong> a palindrome and that it is the <strong style="user-select: auto;">lexicographically smallest</strong> one possible.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the resulting string. If there is no way to replace a character to make it not a palindrome, return an <strong style="user-select: auto;">empty string</strong>.</em></p>

<p style="user-select: auto;">A string <code style="user-select: auto;">a</code> is lexicographically smaller than a string <code style="user-select: auto;">b</code> (of the same length) if in the first position where <code style="user-select: auto;">a</code> and <code style="user-select: auto;">b</code> differ, <code style="user-select: auto;">a</code> has a character strictly smaller than the corresponding character in <code style="user-select: auto;">b</code>. For example, <code style="user-select: auto;">"abcc"</code> is lexicographically smaller than <code style="user-select: auto;">"abcd"</code> because the first position they differ is at the fourth character, and <code style="user-select: auto;">'c'</code> is smaller than <code style="user-select: auto;">'d'</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> palindrome = "abccba"
<strong style="user-select: auto;">Output:</strong> "aaccba"
<strong style="user-select: auto;">Explanation:</strong> There are many ways to make "abccba" not a palindrome, such as "<u style="user-select: auto;">z</u>bccba", "a<u style="user-select: auto;">a</u>ccba", and "ab<u style="user-select: auto;">a</u>cba".
Of all the ways, "aaccba" is the lexicographically smallest.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> palindrome = "a"
<strong style="user-select: auto;">Output:</strong> ""
<strong style="user-select: auto;">Explanation:</strong> There is no way to replace a single character to make "a" not a palindrome, so return an empty string.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= palindrome.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">palindrome</code> consists of only lowercase English letters.</li>
</ul>
</div>