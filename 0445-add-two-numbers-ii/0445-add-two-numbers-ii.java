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
        Stack<Integer> s1 = listToStack(l1);
        Stack<Integer> s2 = listToStack(l2);
        
        ListNode head = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int sum = carry;
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();
            
            ListNode newNode = new ListNode(sum%10);
            newNode.next = head;
            head = newNode;
            
            carry = sum/10;
        }
        return head;
    }
    
    private Stack<Integer> listToStack(ListNode h) {
        Stack<Integer> stack = new Stack();
        
        while(h != null){
            stack.add(h.val);
            h = h.next;
        }
        return stack;
    }
}