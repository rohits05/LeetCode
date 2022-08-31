<h2><a href="https://leetcode.com/problems/pacific-atlantic-water-flow/"><lclighter data-id="lgt270881865" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">417</lclighter><lclighter data-id="lgt270881865" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">. </lclighter><lclighter data-id="lgt270881865" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">Pacific Atlantic Water Flow</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="270881865" data-bundle-id="0" id="lgt270881865" style="background-image: url(&quot;https://photo.getliner.com/liner-service-bucket/user_photo_default/color-8/A.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">There is an <code style="user-select: auto;">m x n</code> rectangular island that borders both the <strong style="user-select: auto;">Pacific Ocean</strong> and <strong style="user-select: auto;">Atlantic Ocean</strong>. The <strong style="user-select: auto;">Pacific Ocean</strong> touches the island's left and top edges, and the <strong style="user-select: auto;">Atlantic Ocean</strong> touches the island's right and bottom edges.</p>

<p style="user-select: auto;">The island is partitioned into a grid of square cells. You are given an <code style="user-select: auto;">m x n</code> integer matrix <code style="user-select: auto;">heights</code> where <code style="user-select: auto;">heights[r][c]</code> represents the <strong style="user-select: auto;">height above sea level</strong> of the cell at coordinate <code style="user-select: auto;">(r, c)</code>.</p>

<p style="user-select: auto;">The island receives a lot of rain, and the rain water can flow to neighboring cells directly north, south, east, and west if the neighboring cell's height is <strong style="user-select: auto;">less than or equal to</strong> the current cell's height. Water can flow from any cell adjacent to an ocean into the ocean.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">a <strong style="user-select: auto;">2D list</strong> of grid coordinates </em><code style="user-select: auto;">result</code><em style="user-select: auto;"> where </em><code style="user-select: auto;">result[i] = [r<sub style="user-select: auto;">i</sub>, c<sub style="user-select: auto;">i</sub>]</code><em style="user-select: auto;"> denotes that rain water can flow from cell </em><code style="user-select: auto;">(r<sub style="user-select: auto;">i</sub>, c<sub style="user-select: auto;">i</sub>)</code><em style="user-select: auto;"> to <strong style="user-select: auto;">both</strong> the Pacific and Atlantic oceans</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/06/08/waterflow-grid.jpg" style="width: 400px; height: 400px; user-select: auto;">
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
<strong style="user-select: auto;">Output:</strong> [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
<strong style="user-select: auto;">Explanation:</strong> The following cells can flow to the Pacific and Atlantic oceans, as shown below:
[0,4]: [0,4] -&gt; Pacific Ocean 
&nbsp;      [0,4] -&gt; Atlantic Ocean
[1,3]: [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
&nbsp;      [1,3] -&gt; [1,4] -&gt; Atlantic Ocean
[1,4]: [1,4] -&gt; [1,3] -&gt; [0,3] -&gt; Pacific Ocean 
&nbsp;      [1,4] -&gt; Atlantic Ocean
[2,2]: [2,2] -&gt; [1,2] -&gt; [0,2] -&gt; Pacific Ocean 
&nbsp;      [2,2] -&gt; [2,3] -&gt; [2,4] -&gt; Atlantic Ocean
[3,0]: [3,0] -&gt; Pacific Ocean 
&nbsp;      [3,0] -&gt; [4,0] -&gt; Atlantic Ocean
[3,1]: [3,1] -&gt; [3,0] -&gt; Pacific Ocean 
&nbsp;      [3,1] -&gt; [4,1] -&gt; Atlantic Ocean
[4,0]: [4,0] -&gt; Pacific Ocean 
       [4,0] -&gt; Atlantic Ocean
Note that there are other possible paths for these cells to flow to the Pacific and Atlantic oceans.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> heights = [[1]]
<strong style="user-select: auto;">Output:</strong> [[0,0]]
<strong style="user-select: auto;">Explanation:</strong> The water can flow from the only cell to the Pacific and Atlantic oceans.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == heights.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == heights[r].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 200</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= heights[r][c] &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>
</div>