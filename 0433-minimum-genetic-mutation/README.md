<h2><a href="https://leetcode.com/problems/minimum-genetic-mutation/">433. Minimum Genetic Mutation</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">A gene string can be represented by an 8-character long string, with choices from <code style="user-select: auto;">'A'</code>, <code style="user-select: auto;">'C'</code>, <code style="user-select: auto;">'G'</code>, and <code style="user-select: auto;">'T'</code>.</p>

<p style="user-select: auto;">Suppose we need to investigate a mutation from a gene string <code style="user-select: auto;">start</code> to a gene string <code style="user-select: auto;">end</code> where one mutation is defined as one single character changed in the gene string.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, <code style="user-select: auto;">"AACCGGTT" --&gt; "AACCGGTA"</code> is one mutation.</li>
</ul>

<p style="user-select: auto;">There is also a gene bank <code style="user-select: auto;">bank</code> that records all the valid gene mutations. A gene must be in <code style="user-select: auto;">bank</code> to make it a valid gene string.</p>

<p style="user-select: auto;">Given the two gene strings <code style="user-select: auto;">start</code> and <code style="user-select: auto;">end</code> and the gene bank <code style="user-select: auto;">bank</code>, return <em style="user-select: auto;">the minimum number of mutations needed to mutate from </em><code style="user-select: auto;">start</code><em style="user-select: auto;"> to </em><code style="user-select: auto;">end</code>. If there is no such a mutation, return <code style="user-select: auto;">-1</code>.</p>

<p style="user-select: auto;">Note that the starting point is assumed to be valid, so it might not be included in the bank.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "AACCGGTT", end = "AACCGGTA", bank = ["AACCGGTA"]
<strong style="user-select: auto;">Output:</strong> 1
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "AACCGGTT", end = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
<strong style="user-select: auto;">Output:</strong> 2
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> start = "AAAAACCC", end = "AACCCCCC", bank = ["AAAACCCC","AAACCCCC","AACCCCCC"]
<strong style="user-select: auto;">Output:</strong> 3
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">start.length == 8</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">end.length == 8</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= bank.length &lt;= 10</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">bank[i].length == 8</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">start</code>, <code style="user-select: auto;">end</code>, and <code style="user-select: auto;">bank[i]</code> consist of only the characters <code style="user-select: auto;">['A', 'C', 'G', 'T']</code>.</li>
</ul>
</div>