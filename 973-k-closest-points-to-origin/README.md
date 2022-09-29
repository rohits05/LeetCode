<h2><a href="https://leetcode.com/problems/k-closest-points-to-origin/">973. K Closest Points to Origin</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array of <code style="user-select: auto;">points</code> where <code style="user-select: auto;">points[i] = [x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>]</code> represents a point on the <strong style="user-select: auto;">X-Y</strong> plane and an integer <code style="user-select: auto;">k</code>, return the <code style="user-select: auto;">k</code> closest points to the origin <code style="user-select: auto;">(0, 0)</code>.</p>

<p style="user-select: auto;">The distance between two points on the <strong style="user-select: auto;">X-Y</strong> plane is the Euclidean distance (i.e., <code style="user-select: auto;">√(x<sub style="user-select: auto;">1</sub> - x<sub style="user-select: auto;">2</sub>)<sup style="user-select: auto;">2</sup> + (y<sub style="user-select: auto;">1</sub> - y<sub style="user-select: auto;">2</sub>)<sup style="user-select: auto;">2</sup></code>).</p>

<p style="user-select: auto;">You may return the answer in <strong style="user-select: auto;">any order</strong>. The answer is <strong style="user-select: auto;">guaranteed</strong> to be <strong style="user-select: auto;">unique</strong> (except for the order that it is in).</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/03/closestplane1.jpg" style="width: 400px; height: 400px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[1,3],[-2,2]], k = 1
<strong style="user-select: auto;">Output:</strong> [[-2,2]]
<strong style="user-select: auto;">Explanation:</strong>
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) &lt; sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[3,3],[5,-1],[-2,4]], k = 2
<strong style="user-select: auto;">Output:</strong> [[3,3],[-2,4]]
<strong style="user-select: auto;">Explanation:</strong> The answer [[-2,4],[3,3]] would also be accepted.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= k &lt;= points.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-10<sup style="user-select: auto;">4</sup> &lt; x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub> &lt; 10<sup style="user-select: auto;">4</sup></code></li>
</ul>
</div>