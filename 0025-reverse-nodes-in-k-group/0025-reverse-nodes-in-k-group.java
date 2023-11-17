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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode cur = dummy, prev = dummy, nex = dummy;
        int count = 0;
        
        while(cur.next != null){
            cur = cur.next;
            count++;
        }
        
        // Traverse till Required Grp Size
        while(count >= k){
            cur = prev.next; // 1st Node of the Grp
            nex = cur.next; // 2nd Node of the Grp
            
            // Reversing K-1 links i.e of Size K Grps
            for(int i=1; i<k; i++){ 
                cur.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = cur.next;
            }
            prev = cur; // At last node of prev reversed Grp
            count -= k; // Current size of Grp
        }
        
        return dummy.next;
    }
}