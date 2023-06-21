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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode ducky = head;
        int len = 1;
        
        while(ducky.next != null){
            len++;
            ducky = ducky.next;
        }
        
        ducky.next = head;
        k = len - k % len;
        // k = k % len;
        // k = len - k;
        
        while(k-- > 0) ducky = ducky.next;
        head = ducky.next;
        ducky.next = null;
        
        return head;
    }
}