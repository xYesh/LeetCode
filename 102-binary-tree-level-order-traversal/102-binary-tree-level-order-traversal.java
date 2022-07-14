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
    
    List<List<Integer>> sol;
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        if (sol.size() <= level) {
            sol.add(new ArrayList());
        }
        
        List<Integer> temp = sol.get(level);
        temp.add(root.val);
        
        helper(root.left,level+1);
        helper(root.right,level+1);
        
    }
}