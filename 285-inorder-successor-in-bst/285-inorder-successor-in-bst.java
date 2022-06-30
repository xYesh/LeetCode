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
    
    boolean foundChar = false;
    TreeNode sol = null;
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return root;
        }        
        helper(root,p);    
        return sol;
    }
    
    private void helper(TreeNode root, TreeNode p) {
        
        if (root == null || sol!= null) {
            return;
        }

        helper(root.left,p);

        if (foundChar) {
           sol = root;
            foundChar = false;
           return;
        }
        
        if (root == p) {
            foundChar = true;
        }
        
        helper(root.right,p);        
        return;
    }
}