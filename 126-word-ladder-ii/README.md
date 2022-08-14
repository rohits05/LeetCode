<h2><a href="https://leetcode.com/problems/word-ladder-ii/">126. Word Ladder II</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A <strong style="user-select: auto;">transformation sequence</strong> from word <code style="user-select: auto;">beginWord</code> to word <code style="user-select: auto;">endWord</code> using a dictionary <code style="user-select: auto;">wordList</code> is a sequence of words <code style="user-select: auto;">beginWord -&gt; s<sub style="user-select: auto;">1</sub> -&gt; s<sub style="user-select: auto;">2</sub> -&gt; ... -&gt; s<sub style="user-select: auto;">k</sub></code> such that:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Every adjacent pair of words differs by a single letter.</li>
	<li style="user-select: auto;">Every <code style="user-select: auto;">s<sub style="user-select: auto;">i</sub></code> for <code style="user-select: auto;">1 &lt;= i &lt;= k</code> is in <code style="user-select: auto;">wordList</code>. Note that <code style="user-select: auto;">beginWord</code> does not need to be in <code style="user-select: auto;">wordList</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">s<sub style="user-select: auto;">k</sub> == endWord</code></li>
</ul>

<p style="user-select: auto;">Given two words, <code style="user-select: auto;">beginWord</code> and <code style="user-select: auto;">endWord</code>, and a dictionary <code style="user-select: auto;">wordList</code>, return <em style="user-select: auto;">all the <strong style="user-select: auto;">shortest transformation sequences</strong> from</em> <code style="user-select: auto;">beginWord</code> <em style="user-select: auto;">to</em> <code style="user-select: auto;">endWord</code><em style="user-select: auto;">, or an empty list if no such sequence exists. Each sequence should be returned as a list of the words </em><code style="user-select: auto;">[beginWord, s<sub style="user-select: auto;">1</sub>, s<sub style="user-select: auto;">2</sub>, ..., s<sub style="user-select: auto;">k</sub>]</code>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
<strong style="user-select: auto;">Output:</strong> [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
<strong style="user-select: auto;">Explanation:</strong>&nbsp;There are 2 shortest transformation sequences:
"hit" -&gt; "hot" -&gt; "dot" -&gt; "dog" -&gt; "cog"
"hit" -&gt; "hot" -&gt; "lot" -&gt; "log" -&gt; "cog"
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
<strong style="user-select: auto;">Output:</strong> []
<strong style="user-select: auto;">Explanation:</strong> The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= beginWord.length &lt;= 5</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">endWord.length == beginWord.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= wordList.length &lt;= 500</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">wordList[i].length == beginWord.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">beginWord</code>, <code style="user-select: auto;">endWord</code>, and <code style="user-select: auto;">wordList[i]</code> consist of lowercase English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">beginWord != endWord</code></li>
	<li style="user-select: auto;">All the words in <code style="user-select: auto;">wordList</code> are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>