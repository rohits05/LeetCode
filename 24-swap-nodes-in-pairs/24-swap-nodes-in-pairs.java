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
    public ListNode swapPairs(ListNode head) {
//         if (head == null || head.next == null)  return head;
        
//         ListNode second = head.next;
//         ListNode third = second.next;
        
//         second.next = head;
//         head.next = swapPairs(third);   
//         return second;
        
        // AnoTher AppRoach
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy, curr = head; dummy.next = head;
        
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            curr = curr.next;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}