<h2><a href="https://leetcode.com/problems/design-skiplist/">1206. Design Skiplist</a></h2><h3>Hard</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design a <strong style="user-select: auto;">Skiplist</strong> without using any built-in libraries.</p>

<p style="user-select: auto;">A <strong style="user-select: auto;">skiplist</strong> is a data structure that takes <code style="user-select: auto;">O(log(n))</code> time to add, erase and search. Comparing with treap and red-black tree which has the same function and performance, the code length of Skiplist can be comparatively short and the idea behind Skiplists is just simple linked lists.</p>

<p style="user-select: auto;">For example, we have a Skiplist containing <code style="user-select: auto;">[30,40,50,60,70,90]</code> and we want to add <code style="user-select: auto;">80</code> and <code style="user-select: auto;">45</code> into it. The Skiplist works this way:</p>

<p style="user-select: auto;"><img alt="" src="https://assets.leetcode.com/uploads/2019/09/27/1506_skiplist.gif" style="width: 500px; height: 173px; user-select: auto;"><br style="user-select: auto;">
<small style="user-select: auto;">Artyom Kalinin [CC BY-SA 3.0], via <a href="https://commons.wikimedia.org/wiki/File:Skip_list_add_element-en.gif" target="_blank" title="Artyom Kalinin [CC BY-SA 3.0 (https://creativecommons.org/licenses/by-sa/3.0)], via Wikimedia Commons" style="user-select: auto;">Wikimedia Commons</a></small></p>

<p style="user-select: auto;">You can see there are many layers in the Skiplist. Each layer is a sorted linked list. With the help of the top layers, add, erase and search can be faster than <code style="user-select: auto;">O(n)</code>. It can be proven that the average time complexity for each operation is <code style="user-select: auto;">O(log(n))</code> and space complexity is <code style="user-select: auto;">O(n)</code>.</p>

<p style="user-select: auto;">See more about Skiplist: <a href="https://en.wikipedia.org/wiki/Skip_list" target="_blank" style="user-select: auto;">https://en.wikipedia.org/wiki/Skip_list</a></p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">Skiplist</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">Skiplist()</code> Initializes the object of the skiplist.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">bool search(int target)</code> Returns <code style="user-select: auto;">true</code> if the integer <code style="user-select: auto;">target</code> exists in the Skiplist or <code style="user-select: auto;">false</code> otherwise.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void add(int num)</code> Inserts the value <code style="user-select: auto;">num</code> into the SkipList.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">bool erase(int num)</code> Removes the value <code style="user-select: auto;">num</code> from the Skiplist and returns <code style="user-select: auto;">true</code>. If <code style="user-select: auto;">num</code> does not exist in the Skiplist, do nothing and return <code style="user-select: auto;">false</code>. If there exist multiple <code style="user-select: auto;">num</code> values, removing any one of them is fine.</li>
</ul>

<p style="user-select: auto;">Note that duplicates may exist in the Skiplist, your code needs to handle this situation.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["Skiplist", "add", "add", "add", "search", "add", "search", "erase", "erase", "search"]
[[], [1], [2], [3], [0], [4], [1], [0], [1], [1]]
<strong style="user-select: auto;">Output</strong>
[null, null, null, null, false, null, true, false, true, false]

<strong style="user-select: auto;">Explanation</strong>
Skiplist skiplist = new Skiplist();
skiplist.add(1);
skiplist.add(2);
skiplist.add(3);
skiplist.search(0); // return False
skiplist.add(4);
skiplist.search(1); // return True
skiplist.erase(0);  // return False, 0 is not in skiplist.
skiplist.erase(1);  // return True
skiplist.search(1); // return False, 1 has already been erased.</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= num, target &lt;= 2 * 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">5 * 10<sup style="user-select: auto;">4</sup></code> calls will be made to <code style="user-select: auto;">search</code>, <code style="user-select: auto;">add</code>, and <code style="user-select: auto;">erase</code>.</li>
</ul>
</div>