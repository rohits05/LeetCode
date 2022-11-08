<h2><a href="https://leetcode.com/problems/make-the-string-great/">1544. Make The String Great</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> of lower and upper case English letters.</p>

<p style="user-select: auto;">A good string is a string which doesn't have <strong style="user-select: auto;">two adjacent characters</strong> <code style="user-select: auto;">s[i]</code> and <code style="user-select: auto;">s[i + 1]</code> where:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= i &lt;= s.length - 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is a lower-case letter and <code style="user-select: auto;">s[i + 1]</code> is the same letter but in upper-case or <strong style="user-select: auto;">vice-versa</strong>.</li>
</ul>

<p style="user-select: auto;">To make the string good, you can choose <strong style="user-select: auto;">two adjacent</strong> characters that make the string bad and remove them. You can keep doing this until the string becomes good.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the string</em> after making it good. The answer is guaranteed to be unique under the given constraints.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Notice</strong> that an empty string is also good.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "leEeetcode"
<strong style="user-select: auto;">Output:</strong> "leetcode"
<strong style="user-select: auto;">Explanation:</strong> In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "abBAcC"
<strong style="user-select: auto;">Output:</strong> ""
<strong style="user-select: auto;">Explanation:</strong> We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --&gt; "aAcC" --&gt; "cC" --&gt; ""
"abBAcC" --&gt; "abBA" --&gt; "aA" --&gt; ""
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "s"
<strong style="user-select: auto;">Output:</strong> "s"
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains only lower and upper case English letters.</li>
</ul>
</div>