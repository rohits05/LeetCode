# Delete a Node in Single Linked List
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given a singly linked list and an integer x.Delete x<sup style="user-select: auto;">th</sup> node from the&nbsp;singly&nbsp;linked list. </span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;"> </strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>1 -&gt; 3 -&gt; 4 
&nbsp;     </span> <span style="font-size: 18px; user-select: auto;">x = 3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Output: </strong>1 -&gt; 3</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation:
</strong></span><span style="font-size: 18px; user-select: auto;">After deleting the node at 3rd
</span><span style="font-size: 18px; user-select: auto;">position (1-base indexing), the
</span><span style="font-size: 18px; user-select: auto;">linked list is as 1 -&gt; 3. </span>
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Example 2:</span></strong></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>1 -&gt; 5 -&gt; 2 -&gt; 9 </span>
<span style="font-size: 18px; user-select: auto;">x = 2<strong style="user-select: auto;">
Output: </strong>1 -&gt; 2 -&gt; 9
<strong style="user-select: auto;">Explanation: </strong></span>
<span style="font-size: 18px; user-select: auto;">After deleting the node at 2nd</span>
<span style="font-size: 18px; user-select: auto;">position (1-based indexing), the</span>
<span style="font-size: 18px; user-select: auto;">linked list is as 1 -&gt; 2 -&gt; 9.</span></pre>

<p style="user-select: auto;">&nbsp;</p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your task:&nbsp;</strong>Your task is to complete the method <strong style="user-select: auto;">deleteNode()</strong> which takes two arguments: the address of the head of the linked list and an integer x. The function returns the head of the modified linked list.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1 &lt;= T &lt;= 300<br style="user-select: auto;">
2 &lt;= N &lt;= 100<br style="user-select: auto;">
1 &lt;= x &lt;= N</span><br style="user-select: auto;">
&nbsp;</p>
</div>