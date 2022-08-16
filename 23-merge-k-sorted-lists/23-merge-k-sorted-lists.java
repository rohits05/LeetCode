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
    public ListNode mergeKLists(ListNode[] lists) {  
        if (lists==null || lists.length==0) return null;
        
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length, (a,b)-> a.val-b.val);
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
        
        // Using Min Heap
       // PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.data-b.data);
       // for (int i = 0; i < arr.length; i++) {
       //     if (arr[i] != null)
       //         pq.add(arr[i]);
       // }
       // Node res = new Node(-1), restail = res;
       // while (!pq.isEmpty()) {
       //     Node n = pq.poll();
       //     restail.next = n;
       //     restail = restail.next;
       //     n = n.next;
       //     if (n != null) {
       //         pq.add(n);
       //     }
       // }
       // return res.next;
    }
}