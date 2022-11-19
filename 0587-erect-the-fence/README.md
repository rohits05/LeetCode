<h2><a href="https://leetcode.com/problems/erect-the-fence/">587. Erect the Fence</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an array <code style="user-select: auto;">trees</code> where <code style="user-select: auto;">trees[i] = [x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub>]</code> represents the location of a tree in the garden.</p>

<p style="user-select: auto;">You are asked to fence the entire garden using the minimum length of rope as it is expensive. The garden is well fenced only if <strong style="user-select: auto;">all the trees are enclosed</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the coordinates of trees that are exactly located on the fence perimeter</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/erect2-plane.jpg" style="width: 509px; height: 500px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
<strong style="user-select: auto;">Output:</strong> [[1,1],[2,0],[3,3],[2,4],[4,2]]
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/24/erect1-plane.jpg" style="width: 509px; height: 500px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> points = [[1,2],[2,2],[4,2]]
<strong style="user-select: auto;">Output:</strong> [[4,2],[2,2],[1,2]]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= points.length &lt;= 3000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">points[i].length == 2</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= x<sub style="user-select: auto;">i</sub>, y<sub style="user-select: auto;">i</sub> &lt;= 100</code></li>
	<li style="user-select: auto;">All the given points are <strong style="user-select: auto;">unique</strong>.</li>
</ul>
</div>