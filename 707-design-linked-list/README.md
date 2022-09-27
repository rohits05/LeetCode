<h2><a href="https://leetcode.com/problems/design-linked-list/">707. Design Linked List</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design your implementation of the linked list. You can choose to use a singly or doubly linked list.<br style="user-select: auto;">
A node in a singly linked list should have two attributes: <code style="user-select: auto;">val</code> and <code style="user-select: auto;">next</code>. <code style="user-select: auto;">val</code> is the value of the current node, and <code style="user-select: auto;">next</code> is a pointer/reference to the next node.<br style="user-select: auto;">
If you want to use the doubly linked list, you will need one more attribute <code style="user-select: auto;">prev</code> to indicate the previous node in the linked list. Assume all nodes in the linked list are <strong style="user-select: auto;">0-indexed</strong>.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">MyLinkedList</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">MyLinkedList()</code> Initializes the <code style="user-select: auto;">MyLinkedList</code> object.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int get(int index)</code> Get the value of the <code style="user-select: auto;">index<sup style="user-select: auto;">th</sup></code> node in the linked list. If the index is invalid, return <code style="user-select: auto;">-1</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void addAtHead(int val)</code> Add a node of value <code style="user-select: auto;">val</code> before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void addAtTail(int val)</code> Append a node of value <code style="user-select: auto;">val</code> as the last element of the linked list.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void addAtIndex(int index, int val)</code> Add a node of value <code style="user-select: auto;">val</code> before the <code style="user-select: auto;">index<sup style="user-select: auto;">th</sup></code> node in the linked list. If <code style="user-select: auto;">index</code> equals the length of the linked list, the node will be appended to the end of the linked list. If <code style="user-select: auto;">index</code> is greater than the length, the node <strong style="user-select: auto;">will not be inserted</strong>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void deleteAtIndex(int index)</code> Delete the <code style="user-select: auto;">index<sup style="user-select: auto;">th</sup></code> node in the linked list, if the index is valid.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
<strong style="user-select: auto;">Output</strong>
[null, null, null, null, 2, null, 3]

<strong style="user-select: auto;">Explanation</strong>
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1-&gt;2-&gt;3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1-&gt;3
myLinkedList.get(1);              // return 3
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= index, val &lt;= 1000</code></li>
	<li style="user-select: auto;">Please do not use the built-in LinkedList library.</li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">2000</code> calls will be made to <code style="user-select: auto;">get</code>, <code style="user-select: auto;">addAtHead</code>, <code style="user-select: auto;">addAtTail</code>, <code style="user-select: auto;">addAtIndex</code> and <code style="user-select: auto;">deleteAtIndex</code>.</li>
</ul>
</div>