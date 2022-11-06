<h2><a href="https://leetcode.com/problems/orderly-queue/">899. Orderly Queue</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code> and an integer <code style="user-select: auto;">k</code>. You can choose one of the first <code style="user-select: auto;">k</code> letters of <code style="user-select: auto;">s</code> and append it at the end of the string..</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the lexicographically smallest string you could have after applying the mentioned step any number of moves</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "cba", k = 1
<strong style="user-select: auto;">Output:</strong> "acb"
<strong style="user-select: auto;">Explanation:</strong> 
In the first move, we move the 1<sup style="user-select: auto;">st</sup> character 'c' to the end, obtaining the string "bac".
In the second move, we move the 1<sup style="user-select: auto;">st</sup> character 'b' to the end, obtaining the final result "acb".
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "baaca", k = 3
<strong style="user-select: auto;">Output:</strong> "aaabc"
<strong style="user-select: auto;">Explanation:</strong> 
In the first move, we move the 1<sup style="user-select: auto;">st</sup> character 'b' to the end, obtaining the string "aacab".
In the second move, we move the 3<sup style="user-select: auto;">rd</sup> character 'c' to the end, obtaining the final result "aaabc".
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= s.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s</code> consist of lowercase English letters.</li>
</ul>
</div>