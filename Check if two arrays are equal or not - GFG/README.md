# Check if two arrays are equal or not
## Easy
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given two arrays <strong style="user-select: auto;">A</strong> and <strong style="user-select: auto;">B</strong> of equal size <strong style="user-select: auto;">N</strong>, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.<br style="user-select: auto;">
<strong style="user-select: auto;">Note :</strong>&nbsp;If there are repetitions, then counts of repeated elements must also be same for two array to be equal.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
<strong style="user-select: auto;">Output: </strong>1<strong style="user-select: auto;">
Explanation: </strong>Both the array can be 
rearranged to {0,1,2,4,5}</span>
</pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input:
</strong>N = 3
A[] = {1,2,5}
B[] = {2,4,15}
<strong style="user-select: auto;">Output: </strong>0<strong style="user-select: auto;">
Explanation: </strong>A[] and B[] have only 
one common value.</span></pre>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:</strong><br style="user-select: auto;">
Complete&nbsp;<strong style="user-select: auto;">check() </strong>function which takes both the given array and their size as function arguments and returns <strong style="user-select: auto;">true</strong> if the arrays are equal else <strong style="user-select: auto;">returns false</strong>.The 0 and 1 printing is done by the driver code.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Expected Time Complexity </strong>: O(N)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxilliary Space</strong> : O(N)</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
1&lt;=N&lt;=10<sup style="user-select: auto;">7</sup><br style="user-select: auto;">
1&lt;=A[],B[]&lt;=10<sup style="user-select: auto;">18</sup></span></p>

<p style="user-select: auto;">&nbsp;</p>
</div>