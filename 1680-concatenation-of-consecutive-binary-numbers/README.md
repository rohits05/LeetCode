<h2><a href="https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/">1680. Concatenation of Consecutive Binary Numbers</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an integer <code style="user-select: auto;">n</code>, return <em style="user-select: auto;">the <strong style="user-select: auto;">decimal value</strong> of the binary string formed by concatenating the binary representations of </em><code style="user-select: auto;">1</code><em style="user-select: auto;"> to </em><code style="user-select: auto;">n</code><em style="user-select: auto;"> in order, <strong style="user-select: auto;">modulo </strong></em><code style="user-select: auto;">10<sup style="user-select: auto;">9 </sup>+ 7</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 1
<strong style="user-select: auto;">Output:</strong> 1
<strong style="user-select: auto;">Explanation: </strong>"1" in binary corresponds to the decimal value 1. 
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 3
<strong style="user-select: auto;">Output:</strong> 27
<strong style="user-select: auto;">Explanation: </strong>In binary, 1, 2, and 3 corresponds to "1", "10", and "11".
After concatenating them, we have "11011", which corresponds to the decimal value 27.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> n = 12
<strong style="user-select: auto;">Output:</strong> 505379714
<strong style="user-select: auto;">Explanation</strong>: The concatenation results in "1101110010111011110001001101010111100".
The decimal value of that is 118505380540.
After modulo 10<sup style="user-select: auto;">9</sup> + 7, the result is 505379714.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>