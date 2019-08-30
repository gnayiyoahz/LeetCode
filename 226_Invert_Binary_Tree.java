/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;        
        if (isLeaf(root.left) && isLeaf(root.right)) {
            root.left = root.right;
            root.right = temp;
        } else {
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }
    
    public boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }
}
