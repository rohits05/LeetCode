<h2><a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Roman numerals are represented by seven different symbols:&nbsp;<code style="user-select: auto;">I</code>, <code style="user-select: auto;">V</code>, <code style="user-select: auto;">X</code>, <code style="user-select: auto;">L</code>, <code style="user-select: auto;">C</code>, <code style="user-select: auto;">D</code> and <code style="user-select: auto;">M</code>.</p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Symbol</strong>       <strong style="user-select: auto;">Value</strong>
I             1
V             5
X             10
L             50
C             100
D             500
M             1000</pre>

<p style="user-select: auto;">For example,&nbsp;<code style="user-select: auto;">2</code> is written as <code style="user-select: auto;">II</code>&nbsp;in Roman numeral, just two ones added together. <code style="user-select: auto;">12</code> is written as&nbsp;<code style="user-select: auto;">XII</code>, which is simply <code style="user-select: auto;">X + II</code>. The number <code style="user-select: auto;">27</code> is written as <code style="user-select: auto;">XXVII</code>, which is <code style="user-select: auto;">XX + V + II</code>.</p>

<p style="user-select: auto;">Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not <code style="user-select: auto;">IIII</code>. Instead, the number four is written as <code style="user-select: auto;">IV</code>. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as <code style="user-select: auto;">IX</code>. There are six instances where subtraction is used:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">I</code> can be placed before <code style="user-select: auto;">V</code> (5) and <code style="user-select: auto;">X</code> (10) to make 4 and 9.&nbsp;</li>
	<li style="user-select: auto;"><code style="user-select: auto;">X</code> can be placed before <code style="user-select: auto;">L</code> (50) and <code style="user-select: auto;">C</code> (100) to make 40 and 90.&nbsp;</li>
	<li style="user-select: auto;"><code style="user-select: auto;">C</code> can be placed before <code style="user-select: auto;">D</code> (500) and <code style="user-select: auto;">M</code> (1000) to make 400 and 900.</li>
</ul>

<p style="user-select: auto;">Given a roman numeral, convert it to an integer.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "III"
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> III = 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "LVIII"
<strong style="user-select: auto;">Output:</strong> 58
<strong style="user-select: auto;">Explanation:</strong> L = 50, V= 5, III = 3.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "MCMXCIV"
<strong style="user-select: auto;">Output:</strong> 1994
<strong style="user-select: auto;">Explanation:</strong> M = 1000, CM = 900, XC = 90 and IV = 4.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 15</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> contains only&nbsp;the characters <code style="user-select: auto;">('I', 'V', 'X', 'L', 'C', 'D', 'M')</code>.</li>
	<li style="user-select: auto;">It is <strong style="user-select: auto;">guaranteed</strong>&nbsp;that <code style="user-select: auto;">s</code> is a valid roman numeral in the range <code style="user-select: auto;">[1, 3999]</code>.</li>
</ul>
</div>