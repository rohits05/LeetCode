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
    public int pairSum(ListNode head) {
            if (head == null)  return 0;
            if (head.next == null) return head.val;
        
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        
            slow = reverse(slow);
            fast = head;
            int sum = Integer.MIN_VALUE;
        
            while (slow != null) {
                sum = Math.max(sum, slow.val + fast.val);
                slow = slow.next;
                fast = fast.next;
            }
            return sum;
    }
    
    public ListNode reverse(ListNode node) {
            ListNode curr = node;
            ListNode prev = null;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }
}