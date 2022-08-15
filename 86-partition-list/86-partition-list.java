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
    public ListNode partition(ListNode head, int x) { 
        ListNode headCopy = head;
        ListNode h = null;
        ListNode t = null;
        
        while (headCopy!=null) {
            ListNode l = new ListNode(headCopy.val); 
            if (l.val < x) {
                l.next = h;
                h = l;
            }
            else {
                l.next = t;
                t = l;
            }
            headCopy = headCopy.next;
        }
        head=null;
        while (t!=null) {
            ListNode l = new ListNode(t.val); 
            l.next=head;
            head = l;
            t = t.next;
        }
        while (h!=null) {
            ListNode l = new ListNode(h.val); 
            l.next=head;
            head = l;
            h = h.next;
        }
        return head;
    }
}