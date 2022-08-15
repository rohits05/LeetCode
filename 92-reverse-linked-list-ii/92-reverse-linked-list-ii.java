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
    public ListNode reverseBetween(ListNode head, int m, int n) {  
//         if(head == null)  return null;
        
//         ListNode dummy = new ListNode(0); 
//         dummy.next = head;
//         ListNode pre = dummy;
        
//         for(int i=0; i<m-1; i++) pre = pre.next;

//         ListNode start = pre.next;
//         ListNode then = start.next; 

//         for(int i=0; i<n-m; i++) {
//             start.next = then.next;
//             then.next = pre.next;
//             pre.next = then;
//             then = start.next;
//         }
//         return dummy.next;
        
        // Anotherc~ Approach
        if(head == null) return null;
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(m > 1) {
            prev = curr;
            curr = curr.next;
            m--; n--;
        }
        
        ListNode connect = prev;
        ListNode tail = curr;
        while(n > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
        }
        
        if(connect != null) connect.next = prev;
        else head = prev;;
        
        tail.next = curr;
        return head;
    }
}