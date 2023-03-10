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
    private List<Integer> values = new ArrayList<>();
    private Random random = new Random();

    public Solution(ListNode head) {
        while (null != head){
            values.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int randomIndex = getRandomNumber();
        return values.get(randomIndex);

    }

    public int getRandomNumber() {
        return random.nextInt(values.size());
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */