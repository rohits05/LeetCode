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
    public ListNode deleteDuplicates(ListNode head) {
       if(head == null)  return null;
       
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode pre = dummy;
       ListNode cur = head;
        
       while(cur != null){
           while(cur.next != null && cur.val == cur.next.val){
               cur = cur.next;
           }
           if(pre.next == cur){
               pre = pre.next;
           }
           else{
               pre.next = cur.next;
           }
           cur = cur.next;
       }
       return dummy.next;
    }
}