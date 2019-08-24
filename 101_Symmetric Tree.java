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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(TreeNode lt, TreeNode rt) {
        if (lt == null && rt == null) return true;
        if (lt == null || rt == null || lt.val != rt.val) return false;
        return isSymmetric(lt.left, rt.right) && isSymmetric(lt.right, rt.left);
    }
}
