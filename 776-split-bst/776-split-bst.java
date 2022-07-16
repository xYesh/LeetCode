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
    public TreeNode[] splitBST(TreeNode root, int target) {
        
        TreeNode[] res = new TreeNode[2];
        
        if (root == null) {
            return res;
        }
        
        if (root.val  <= target) {
            res[0] = root;
            TreeNode[] curr = splitBST(root.right,target);
            res[1] = curr[1];
            root.right = curr[0];            
        } else {
            res[1] = root;
            TreeNode[] curr = splitBST(root.left,target);
            res[0] = curr[0];
            root.left = curr[1];
        }
        
        return res;
        
    }
}