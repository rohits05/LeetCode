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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode dummyHead = new ListNode(0);
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        ListNode leftParentNode = null, rightParentNode = null;

        dummyHead.next = head;
        for(int i = 1; i < k; i++) fast = fast.next;

        leftParentNode = fast;
        while(fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        rightParentNode = slow;
        ListNode left = leftParentNode.next;
        ListNode right = rightParentNode.next;


        leftParentNode.next = right;
        rightParentNode.next = left;

        ListNode temp = right.next;

        right.next = left.next;
        left.next = temp;

        return dummyHead.next;
    }
}