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
     public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slowPrev = null;
         
        while(fast!=null && fast.next!=null){
            slowPrev = (slowPrev==null)? head : slowPrev.next;
            fast = fast.next.next;
        }
        ListNode mid = slowPrev.next;
        slowPrev.next = null;

        return mid;
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        int value = 0;
        if(list1.val>list2.val){
            value = list2.val;
            list2 = list2.next;
        }
        else{
            value = list1.val;
            list1 = list1.next;
        }

        ListNode node = new ListNode(value);
        ListNode ans = node;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode temp = new ListNode(list1.val);
                node.next = temp;
                node = temp;
                list1 = list1.next;
            }
            else{
                ListNode temp = new ListNode(list2.val);
                node.next = temp;
                node = temp;
                list2 = list2.next;
            }

        }

        if(list1 != null){
            while(list1 != null){
                ListNode temp = new ListNode(list1.val);
                node.next = temp;
                node = temp;
                list1=list1.next;
            }
        }
        if(list2 != null){
            while(list2 != null){
                ListNode temp = new ListNode(list2.val);
                node.next = temp;
                node = temp;
                list2=list2.next;
            }
        }
        return ans;
}
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)  return head;

        ListNode middle = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return mergeTwoLists(left, right);
    }
}
