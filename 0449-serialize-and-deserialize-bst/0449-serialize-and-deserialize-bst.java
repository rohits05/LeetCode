/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder string = new StringBuilder();
        traverse(root, string);
        return string.toString();
    }
    
    private void traverse(TreeNode root, StringBuilder string){
        if(root == null) return;
        string.append(root.val).append(",");
        traverse(root.left, string);
        traverse(root.right, string);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] dataArr = data.split(",");
        
        TreeNode root = new TreeNode(Integer.parseInt(dataArr[0]));
        for(int i=1; i<dataArr.length; i++)
            insert(Integer.parseInt(dataArr[i]), root);
        
        return root;
    }
    
    private void insert(int digit, TreeNode root){
        if(digit > root.val){
            if(root.right != null) insert(digit, root.right);
            else root.right = new TreeNode(digit);
        } else {
            if(root.left != null) insert(digit, root.left);
            else root.left = new TreeNode(digit);
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;