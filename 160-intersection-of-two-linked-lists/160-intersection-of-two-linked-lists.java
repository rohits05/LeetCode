/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode ducky1 = headA;
        ListNode ducky2 = headB;
        
        while(ducky1 != ducky2){
            // reseting pointer to another's head
            ducky1 = ducky1 == null ? headB : ducky1.next;
            ducky2 = ducky2 == null ? headA : ducky2.next;
        }
        
        return ducky1;   
    }
}