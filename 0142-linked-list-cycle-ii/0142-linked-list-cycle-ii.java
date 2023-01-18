/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode oneJump = head;
        ListNode twoJump = head;
        ListNode entry = head;
        
        while(twoJump.next != null && twoJump.next.next != null){
            oneJump = oneJump.next;
            twoJump = twoJump.next.next;
            
            if(oneJump == twoJump){ // Got That Collision point
                while(oneJump != entry){
                    oneJump = oneJump.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        
        return null;
    }
}