<h2><a href="https://leetcode.com/problems/unique-morse-code-words/">804. Unique Morse Code Words</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">'a'</code> maps to <code style="user-select: auto;">".-"</code>,</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'b'</code> maps to <code style="user-select: auto;">"-..."</code>,</li>
	<li style="user-select: auto;"><code style="user-select: auto;">'c'</code> maps to <code style="user-select: auto;">"-.-."</code>, and so on.</li>
</ul>

<p style="user-select: auto;">For convenience, the full table for the <code style="user-select: auto;">26</code> letters of the English alphabet is given below:</p>

<pre style="user-select: auto;">[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]</pre>

<p style="user-select: auto;">Given an array of strings <code style="user-select: auto;">words</code> where each word can be written as a concatenation of the Morse code of each letter.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">"cab"</code> can be written as <code style="user-select: auto;">"-.-..--..."</code>, which is the concatenation of <code style="user-select: auto;">"-.-."</code>, <code style="user-select: auto;">".-"</code>, and <code style="user-select: auto;">"-..."</code>. We will call such a concatenation the <strong style="user-select: auto;">transformation</strong> of a word.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">the number of different <strong style="user-select: auto;">transformations</strong> among all words we have</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["gin","zen","gig","msg"]
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The transformation of each word is:
"gin" -&gt; "--...-."
"zen" -&gt; "--...-."
"gig" -&gt; "--...--."
"msg" -&gt; "--...--."
There are 2 different transformations: "--...-." and "--...--.".
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["a"]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 12</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</li>
</ul>
</div>