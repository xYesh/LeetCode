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
    
    List<List<Integer>> sol = new ArrayList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        helper(root, 0, false);
        return sol;
    }
    
    private void helper(TreeNode root, int level, boolean leftToRight) {
        if (root == null) {
            return;
        }
        
        if (sol.size() == level) {
            sol.add(new ArrayList());
            sol.get(level).add(root.val);
        } else {
            if (!leftToRight) {
                sol.get(level).add(root.val);
            } else {
                sol.get(level).add(0,root.val);
            }
        }

        helper(root.left,level+1,!leftToRight);
        helper(root.right,level+1,!leftToRight);

    }
}