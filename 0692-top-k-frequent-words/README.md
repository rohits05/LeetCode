<h2><a href="https://leetcode.com/problems/top-k-frequent-words/">692. Top K Frequent Words</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of strings <code style="user-select: auto;">words</code> and an integer <code style="user-select: auto;">k</code>, return <em style="user-select: auto;">the </em><code style="user-select: auto;">k</code><em style="user-select: auto;"> most frequent strings</em>.</p>

<p style="user-select: auto;">Return the answer <strong style="user-select: auto;">sorted</strong> by <strong style="user-select: auto;">the frequency</strong> from highest to lowest. Sort the words with the same frequency by their <strong style="user-select: auto;">lexicographical order</strong>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["i","love","leetcode","i","love","coding"], k = 2
<strong style="user-select: auto;">Output:</strong> ["i","love"]
<strong style="user-select: auto;">Explanation:</strong> "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
<strong style="user-select: auto;">Output:</strong> ["the","is","sunny","day"]
<strong style="user-select: auto;">Explanation:</strong> "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words.length &lt;= 500</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= words[i].length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">words[i]</code> consists of lowercase English letters.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">k</code> is in the range <code style="user-select: auto;">[1, The number of <strong style="user-select: auto;">unique</strong> words[i]]</code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow-up:</strong> Could you solve it in <code style="user-select: auto;">O(n log(k))</code> time and <code style="user-select: auto;">O(n)</code> extra space?</p>
</div>