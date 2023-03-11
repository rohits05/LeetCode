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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        ListNode temp = head; 
        int n = 0;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }
        return sortedListToBST(head, 0 ,n);
    }
    
     TreeNode sortedListToBST(ListNode head, int start, int end) {
        if(start > end) return null;
        
        int middle = (end + start)/2;
        ListNode temp = head;
        
        for(int i=start; i<middle; i++) temp = temp.next;
        
        TreeNode node = new TreeNode(temp.val);
        node.left = sortedListToBST(head,start, middle-1);
        node.right = sortedListToBST(temp.next, middle+1, end);
        
        return node;
    }
}