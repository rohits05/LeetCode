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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Finding Mid Elm
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverseList(slow.next); // Reversing right half
        slow = slow.next; // Moving slow to right half
        
        while(slow != null){
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        
        // To Re-MoDiFY The LL 
          // ListNode dummy;
//         ListNode slow = dummy;
//         ListNode fast = dummy;
        
//         // Finding Mid Elm
//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         slow.next = reverseList(slow.next); // Reversing right half
        return true;
    }
    
    ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        
        while(head !=  null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}