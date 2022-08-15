/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> stack = new Stack<>();
        Node travel = head;
        while(travel != null || !stack.isEmpty()) {
            if(travel.child != null) {
                if(travel.next != null) stack.push(travel.next);
                travel.next = travel.child;
                travel.next.prev = travel;
                travel.child = null;
            } else {
                if(travel.next == null && !stack.isEmpty()) {
                    travel.next = stack.pop();
                    travel.next.prev = travel;
                }
            }
            travel = travel.next;
        }
        return head;
    }
}