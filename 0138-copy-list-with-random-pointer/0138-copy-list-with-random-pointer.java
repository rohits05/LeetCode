/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node iter = head, front = head;
        // 1st phase
        while(iter != null){
            front = iter.next;
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;
            iter = front;
          }

        // 2nd phase
        iter = head;
        while(iter != null){
            if(iter.random != null) iter.next.random = iter.random.next;
            iter = iter.next.next;
          }

        // 3rd phase
        iter = head;
        Node pseudoHead = new Node(0);
        Node copy = pseudoHead;

        while(iter != null){
            front = iter.next.next;
            copy.next = iter.next;
            copy = copy.next;
            iter.next = front;
            iter = front;
          }
        return pseudoHead.next; // head one
    }
}