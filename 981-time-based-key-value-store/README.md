<h2><a href="https://leetcode.com/problems/time-based-key-value-store/">981. Time Based Key-Value Store</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">TimeMap</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">TimeMap()</code> Initializes the object of the data structure.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void set(String key, String value, int timestamp)</code> Stores the key <code style="user-select: auto;">key</code> with the value <code style="user-select: auto;">value </code>at the given time <code style="user-select: auto;">timestamp</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">String get(String key, int timestamp)</code> Returns a value such that <code style="user-select: auto;">set</code> was called previously, with <code style="user-select: auto;">timestamp_prev &lt;= timestamp</code>. If there are multiple such values, it returns the value associated with the largest <code style="user-select: auto;">timestamp_prev</code>. If there are no values, it returns <code style="user-select: auto;">""</code>.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["TimeMap", "set", "get", "get", "set", "get", "get"]
[[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
<strong style="user-select: auto;">Output</strong>
[null, null, "bar", "bar", null, "bar2", "bar2"]

<strong style="user-select: auto;">Explanation</strong>
TimeMap timeMap = new TimeMap();
timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
timeMap.get("foo", 1);         // return "bar"
timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
timeMap.get("foo", 4);         // return "bar2"
timeMap.get("foo", 5);         // return "bar2"
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= key.length, value.length &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">key</code> and <code style="user-select: auto;">value</code> consist of lowercase English letters and digits.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= timestamp &lt;= 10<sup style="user-select: auto;">7</sup></code></li>
	<li style="user-select: auto;">All the timestamps <code style="user-select: auto;">timestamp</code> of <code style="user-select: auto;">set</code> are strictly increasing.</li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">2 * 10<sup style="user-select: auto;">5</sup></code> calls will be made to <code style="user-select: auto;">set</code> and <code style="user-select: auto;">get</code>.</li>
</ul>
</div>