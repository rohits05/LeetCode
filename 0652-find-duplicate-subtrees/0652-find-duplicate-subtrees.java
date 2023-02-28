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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();

        postOrder(root, ans, map);
        return ans;
    }

    public String postOrder(TreeNode root,List<TreeNode>ans,HashMap<String,Integer> map){
        if(root == null) return "";

        String left = postOrder(root.left, ans, map);
        String right = postOrder(root.right, ans, map);

        int currRoot = root.val;
        String str = currRoot + "l" + left + "r" + right;

        if(map.getOrDefault(str, 0) == 1) ans.add(root);
        map.put(str, map.getOrDefault(str, 0) + 1);
        return str;
    }
}