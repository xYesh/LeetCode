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
    public TreeNode[] splitBST(TreeNode root, int V) {
        // result[0] is root of left split tree, result[1] is root of the right.
        TreeNode[] result = new TreeNode[2];
        // Base case.
        if (root == null) return result; 
        
        if (root.val <= V) {
            result[0] = root; 
            TreeNode[] subResult = splitBST(root.right, V);
            result[1] = subResult[1];
            root.right = subResult[0];
        } else {
            result[1] = root;
            TreeNode[] subResult = splitBST(root.left, V);
            result[0] = subResult[0];
            root.left = subResult[1];
        }
        return result;
    }
}