<h2><a href="https://leetcode.com/problems/online-stock-span/">901. Online Stock Span</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design an algorithm that collects daily price quotes for some stock and returns <strong style="user-select: auto;">the span</strong> of that stock's price for the current day.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">span</strong> of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, if the price of a stock over the next <code style="user-select: auto;">7</code> days were <code style="user-select: auto;">[100,80,60,70,60,75,85]</code>, then the stock spans would be <code style="user-select: auto;">[1,1,1,2,1,4,6]</code>.</li>
</ul>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">StockSpanner</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">StockSpanner()</code> Initializes the object of the class.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int next(int price)</code> Returns the <strong style="user-select: auto;">span</strong> of the stock's price given that today's price is <code style="user-select: auto;">price</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
[[], [100], [80], [60], [70], [60], [75], [85]]
<strong style="user-select: auto;">Output</strong>
[null, 1, 1, 1, 2, 1, 4, 6]

<strong style="user-select: auto;">Explanation</strong>
StockSpanner stockSpanner = new StockSpanner();
stockSpanner.next(100); // return 1
stockSpanner.next(80);  // return 1
stockSpanner.next(60);  // return 1
stockSpanner.next(70);  // return 2
stockSpanner.next(60);  // return 1
stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
stockSpanner.next(85);  // return 6
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= price &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">10<sup style="user-select: auto;">4</sup></code> calls will be made to <code style="user-select: auto;">next</code>.</li>
</ul>
</div>