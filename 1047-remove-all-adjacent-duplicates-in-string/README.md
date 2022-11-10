<h2><a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">1047. Remove All Adjacent Duplicates In String</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code> consisting of lowercase English letters. A <strong style="user-select: auto;">duplicate removal</strong> consists of choosing two <strong style="user-select: auto;">adjacent</strong> and <strong style="user-select: auto;">equal</strong> letters and removing them.</p>

<p style="user-select: auto;">We repeatedly make <strong style="user-select: auto;">duplicate removals</strong> on <code style="user-select: auto;">s</code> until we no longer can.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the final string after all such duplicate removals have been made</em>. It can be proven that the answer is <strong style="user-select: auto;">unique</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "abbaca"
<strong style="user-select: auto;">Output:</strong> "ca"
<strong style="user-select: auto;">Explanation:</strong> 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "azxxzy"
<strong style="user-select: auto;">Output:</strong> "ay"
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of lowercase English letters.</li>
</ul>
</div>