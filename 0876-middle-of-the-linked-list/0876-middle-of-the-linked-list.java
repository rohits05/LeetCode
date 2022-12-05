/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode oneJump = head, twoJump = head;
        
       while(twoJump != null && twoJump.next != null){
            oneJump = oneJump.next;
            twoJump = twoJump.next.next;
        }
        
        return oneJump;     
    }
}