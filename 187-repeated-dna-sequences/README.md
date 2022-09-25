<h2><a href="https://leetcode.com/problems/repeated-dna-sequences/">187. Repeated DNA Sequences</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">DNA sequence</strong> is composed of a series of nucleotides abbreviated as <code style="user-select: auto;">'A'</code>, <code style="user-select: auto;">'C'</code>, <code style="user-select: auto;">'G'</code>, and <code style="user-select: auto;">'T'</code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">"ACGAATTCCG"</code> is a <strong style="user-select: auto;">DNA sequence</strong>.</li>
</ul>

<p style="user-select: auto;">When studying <strong style="user-select: auto;">DNA</strong>, it is useful to identify repeated sequences within the DNA.</p>

<p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> that represents a <strong style="user-select: auto;">DNA sequence</strong>, return all the <strong style="user-select: auto;"><code style="user-select: auto;">10</code>-letter-long</strong> sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in <strong style="user-select: auto;">any order</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
<strong style="user-select: auto;">Output:</strong> ["AAAAACCCCC","CCCCCAAAAA"]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "AAAAAAAAAAAAA"
<strong style="user-select: auto;">Output:</strong> ["AAAAAAAAAA"]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is either <code style="user-select: auto;">'A'</code>, <code style="user-select: auto;">'C'</code>, <code style="user-select: auto;">'G'</code>, or <code style="user-select: auto;">'T'</code>.</li>
</ul>
</div>