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
    
    private List<TreeNode> sol = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        sol = new ArrayList<>();
        
        boolean clear = true;
        for (int i: to_delete) {
            if (i == root.val) {
                clear = false;
            }
        }
        
        if (clear) {
            sol.add(root);
        }
        
        helper(root,to_delete);
        
        return sol;
    }
    
    private TreeNode helper(TreeNode root, int[] td) {
        
        if (root == null) {
            return null;
        }
        for (int i: td) {
            if (root.val == i) {
                if (root.left != null) {
                    TreeNode child = helper(root.left,td);
                    if (child!= null)
                        sol.add(child);
                }
                if (root.right != null) {
                    TreeNode child = helper(root.right,td);
                    if (child != null)
                        sol.add(child);
                }
                return null;
            }
        }
        
        root.left = helper(root.left,td);
        root.right = helper(root.right,td);
        
        return root;
        
    }
}