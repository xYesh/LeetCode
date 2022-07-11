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
    
    List<Integer> sol;
    
    public List<Integer> rightSideView(TreeNode root) {
        sol = new ArrayList();
        
        if (root == null) {
            return sol;
        }
                
        helper(root,0);      
        
        return sol;
    }
    
    private void helper(TreeNode root, int level) {
        
        if (root == null) {
            return;
        }
        
        if (root != null) {
            
            if (sol.size() == level) {
                sol.add(root.val);
            }
        }
        
        if (root.right != null) {
            helper(root.right,level+1);
        } 
        if (root.left != null) {
            helper(root.left,level+1);
        }
    }
}