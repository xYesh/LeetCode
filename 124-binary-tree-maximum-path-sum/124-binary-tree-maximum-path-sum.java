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
    
    int sol = 0;
    
    public int maxPathSum(TreeNode root) {
        sol = Integer.MIN_VALUE;
        
        if (root == null) {
            return 0;
        }
        
        helper(root);
         
        return sol;
    }
    
    private int helper(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        
        // System.out.println( left + " " + right + " " + root.val);
        
        int max = Math.max(left,right) + root.val;
        
        sol = Math.max(sol,max);
        
        sol = Math.max(sol,left+right+root.val);
        
        sol = Math.max(sol,root.val);
        
        // System.out.println(max + " " + sol);
        
        return max;
    }

}

