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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int d1 = findDep(root.left), d2 = findDep(root.right);
        if (Math.abs(d1-d2) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int findDep(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return findDep(root.right)+1;
        if (root.right == null) return findDep(root.left)+1;
        return Math.max(findDep(root.left),findDep(root.right))+1;
        
    }
}
