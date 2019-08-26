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
    List<List<Integer>> trav;
    int depth;
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        trav = new ArrayList<>();
        depth = findDepth(root);
        
        for (int i = 0; i < depth; i++) {
            trav.add(i, new ArrayList<Integer>());
        }
        
        traverse(root, 1);
        return trav;
        
    }
    
    public void traverse(TreeNode root, int level) {
        if (root == null) return;
        traverse(root.left, level+1);
        traverse(root.right, level+1);
        trav.get(depth-level).add(root.val);
    }

    public int findDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.max(findDepth(root.left),findDepth(root.right))+1;
    }
}
