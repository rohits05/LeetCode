<h2><a href="https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/">947. Most Stones Removed with Same Row or Column</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">On a 2D plane, we place <code style="user-select: auto;">n</code> stones at some integer coordinate points. Each coordinate point may have at most one stone.</p>

<p style="user-select: auto;">A stone can be removed if it shares either <strong style="user-select: auto;">the same row or the same column</strong> as another stone that has not been removed.</p>

<p style="user-select: auto;">Given an array <code style="user-select: auto;">stones</code> of length <code style="user-select: auto;">n</code> where <code style="user-select: auto;">stones[i] = [x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>]</code> represents the location of the <code style="user-select: auto;">i<sup style="user-select: auto;">th</sup></code> stone, return <em style="user-select: auto;">the largest possible number of stones that can be removed</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stones = [[0,0],[0,1],[1,0],[1,2],[2,1],[2,2]]
<strong style="user-select: auto;">Output:</strong> 5
<strong style="user-select: auto;">Explanation:</strong> One way to remove 5 stones is as follows:
1. Remove stone [2,2] because it shares the same row as [2,1].
2. Remove stone [2,1] because it shares the same column as [0,1].
3. Remove stone [1,2] because it shares the same row as [1,0].
4. Remove stone [1,0] because it shares the same column as [0,0].
5. Remove stone [0,1] because it shares the same row as [0,0].
Stone [0,0] cannot be removed since it does not share a row/column with another stone still on the plane.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stones = [[0,0],[0,2],[1,1],[2,0],[2,2]]
<strong style="user-select: auto;">Output:</strong> 3
<strong style="user-select: auto;">Explanation:</strong> One way to make 3 moves is as follows:
1. Remove stone [2,2] because it shares the same row as [2,0].
2. Remove stone [2,0] because it shares the same column as [0,0].
3. Remove stone [0,2] because it shares the same row as [0,0].
Stones [0,0] and [1,1] cannot be removed since they do not share a row/column with another stone still on the plane.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 3:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> stones = [[0,0]]
<strong style="user-select: auto;">Output:</strong> 0
<strong style="user-select: auto;">Explanation:</strong> [0,0] is the only stone on the plane, so you cannot remove it.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= stones.length &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub> &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">No two stones are at the same coordinate point.</li>
</ul>
</div>