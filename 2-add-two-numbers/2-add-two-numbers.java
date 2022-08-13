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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ducky = new ListNode();
        ListNode temp = ducky;
        
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1){ // Scenario for movement
            int sum = 0;
            
            // l1 summation
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            // l2 summation
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry;
            carry = sum/10; // new carry
            ListNode psy = new ListNode(sum%10); // res list
            temp.next = psy;
            temp = temp.next;
        }    
        
        return ducky.next; // i.e the head point
    }
}