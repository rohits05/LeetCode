<h2><a href="https://leetcode.com/problems/basic-calculator/">224. Basic Calculator</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given a string <code style="user-select: auto;">s</code> representing a valid expression, implement a basic calculator to evaluate it, and return <em style="user-select: auto;">the result of the evaluation</em>.</p>

<p style="user-select: auto;"><strong style="user-select: auto;">Note:</strong> You are <strong style="user-select: auto;">not</strong> allowed to use any built-in function which evaluates strings as mathematical expressions, such as <code style="user-select: auto;">eval()</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "1 + 1"
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = " 2-1 + 2 "
<strong style="user-select: auto;">Output:</strong> 3
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "(1+(4+5+2)-3)+(6+8)"
<strong style="user-select: auto;">Output:</strong> 23
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 3 * 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consists of digits, <code style="user-select: auto;">'+'</code>, <code style="user-select: auto;">'-'</code>, <code style="user-select: auto;">'('</code>, <code style="user-select: auto;">')'</code>, and <code style="user-select: auto;">' '</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> represents a valid expression.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'+'</code> is <strong style="user-select: auto;">not</strong> used as a unary operation (i.e., <code style="user-select: auto;">"+1"</code> and <code style="user-select: auto;">"+(2 + 3)"</code> is invalid).</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'-'</code> could be used as a unary operation (i.e., <code style="user-select: auto;">"-1"</code> and <code style="user-select: auto;">"-(2 + 3)"</code> is valid).</li>
	<li style="user-select: auto;">There will be no two consecutive operators in the input.</li>
	<li style="user-select: auto;">Every number and running calculation will fit in a signed 32-bit integer.</li>
</ul>
</div>