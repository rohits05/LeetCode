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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        
        ListNode odd = head; // Odd ptr
        ListNode even = head.next; // Even ptr
        ListNode evenHead = even; // Setting EvenHead ptr to even
        
        while(even != null && even.next != null){
            // Case for arrangements of O & E Order
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead; // Joining evenHead after odd ptr
        return head;
    }
}