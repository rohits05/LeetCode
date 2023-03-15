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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        q.add(root);
        list.add(root.val);
        while(!q.isEmpty()){
            for(int i=0; i<q.size(); i++){
                TreeNode cur = q.poll();
                list.add(cur.val);
                
                if(cur.val == -1) continue;
                if(cur.left != null) q.add(cur.left);
                else  q.add(new TreeNode(-1));
                if(cur.right != null) q.add(cur.right);
                else  q.add(new TreeNode(-1));
            }
        }
        
        boolean ans = false;
        for(int num: list){
            if(num == -1) ans = true;
            if(ans == true && num != -1) return false;
        }
        
        return true;
    }
}