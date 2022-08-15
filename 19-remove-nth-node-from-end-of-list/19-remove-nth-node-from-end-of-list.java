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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ducky = new ListNode();
        ducky.next = head;
        
        ListNode fast = ducky;
        ListNode slow = ducky;     

        for(int i=1; i<=n; i++) fast = fast.next;
    
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; 
        return ducky.next;
    }
}