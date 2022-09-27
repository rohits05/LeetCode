<h2><a href="https://leetcode.com/problems/push-dominoes/">838. Push Dominoes</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There are <code style="user-select: auto;">n</code> dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.</p>

<p style="user-select: auto;">After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.</p>

<p style="user-select: auto;">When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.</p>

<p style="user-select: auto;">For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.</p>

<p style="user-select: auto;">You are given a string <code style="user-select: auto;">dominoes</code> representing the initial state where:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">dominoes[i] = 'L'</code>, if the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> domino has been pushed to the left,</li>
	<li style="user-select: auto;"><code style="user-select: auto;">dominoes[i] = 'R'</code>, if the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> domino has been pushed to the right, and</li>
	<li style="user-select: auto;"><code style="user-select: auto;">dominoes[i] = '.'</code>, if the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> domino has not been pushed.</li>
</ul>

<p style="user-select: auto;">Return <em style="user-select: auto;">a string representing the final state</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dominoes = "RR.L"
<strong style="user-select: auto;">Output:</strong> "RR.L"
<strong style="user-select: auto;">Explanation:</strong> The first domino expends no additional force on the second domino.
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/05/18/domino.png" style="height: 196px; width: 512px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> dominoes = ".L.R...LR..L.."
<strong style="user-select: auto;">Output:</strong> "LL.RR.LLRRLL.."
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">n == dominoes.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= n &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">dominoes[i]</code> is either <code style="user-select: auto;">'L'</code>, <code style="user-select: auto;">'R'</code>, or <code style="user-select: auto;">'.'</code>.</li>
</ul>
</div>