<h2><a href="https://leetcode.com/problems/reverse-words-in-a-string/">151. Reverse Words in a String</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an input string <code style="user-select: auto;">s</code>, reverse the order of the <strong style="user-select: auto;">words</strong>.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">word</strong> is defined as a sequence of non-space characters. The <strong style="user-select: auto;">words</strong> in <code style="user-select: auto;">s</code> will be separated by at least one space.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a string of the words in reverse order concatenated by a single space.</em></p>

<p style="user-select: auto;"><b style="user-select: auto;">Note</b> that <code style="user-select: auto;">s</code> may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "the sky is blue"
<strong style="user-select: auto;">Output:</strong> "blue is sky the"
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "  hello world  "
<strong style="user-select: auto;">Output:</strong> "world hello"
<strong style="user-select: auto;">Explanation:</strong> Your reversed string should not contain leading or trailing spaces.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "a good   example"
<strong style="user-select: auto;">Output:</strong> "example good a"
<strong style="user-select: auto;">Explanation:</strong> You need to reduce multiple spaces between two words to a single space in the reversed string.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains English letters (upper-case and lower-case), digits, and spaces <code style="user-select: auto;">' '</code>.</li>
	<li style="user-select: auto;">There is <strong style="user-select: auto;">at least one</strong> word in <code style="user-select: auto;">s</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><b data-stringify-type="bold" style="user-select: auto;">Follow-up:&nbsp;</b>If the string data type is mutable in your language, can&nbsp;you solve it&nbsp;<b data-stringify-type="bold" style="user-select: auto;">in-place</b>&nbsp;with&nbsp;<code data-stringify-type="code" style="user-select: auto;">O(1)</code>&nbsp;extra space?</p>
</div>