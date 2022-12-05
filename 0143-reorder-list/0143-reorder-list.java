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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return; // Simply
        
        ListNode l1 = head; // Head of 1sT Half
        ListNode slow = head; // Head of 2nD Half
        ListNode fast = head; // Tail of 2nD Half
        ListNode prev = null; // Tail of 1sT Half
        
        while(fast != null && fast.next != null){
            prev = slow; 
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode l2 = reverse(slow);
        merge(l1, l2);
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void merge(ListNode l1, ListNode l2){
        while(l1 != null){
            ListNode l1_next = l1.next, l2_next = l2.next;
            l1.next = l2;
            
            if(l1_next == null) break; 
            // 2nd SL next pointing to 1st next SL 
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
    }
}