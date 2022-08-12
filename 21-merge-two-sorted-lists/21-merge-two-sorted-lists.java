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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
         if(list1.val > list2.val){ // Finding out smaller one
            ListNode swap = list1;
            list1 = list2;
            list2 = swap;
        }
        
        ListNode res = list1; // pointing res to 1st smaller one
        
        while(list1 != null && list2 != null){
            ListNode ducky = null; 
            
            while(list1 != null && list1.val <= list2.val){ // In-Place AcTion
                ducky = list1;
                list1 = list1.next;
            } 
            ducky.next = list2; // Moving to next 
            
            // SwappIng
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;     
        }
        return res;
    }
}