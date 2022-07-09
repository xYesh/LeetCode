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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> sol = new ArrayList();
        
        if (root == null) {
            return sol;
        }
        
        LinkedList<TreeNode> bfs = new LinkedList();
        bfs.addLast(root);
        bfs.addLast(null);
        LinkedList<Integer> currsol = new LinkedList();
        boolean is_order_left = true;
        
        while (bfs.size() > 0) {
            TreeNode curr = bfs.pollFirst();
            
            if (curr != null) {
                
                if (is_order_left) {
                    currsol.addLast(curr.val);
                } else {
                    currsol.addFirst(curr.val);
                }
                
                if (curr.left != null) {
                    bfs.addLast(curr.left);
                }
                
                if (curr.right!= null) {
                    bfs.addLast(curr.right);
                }
                
            } else {
                
                sol.add(currsol);
                currsol = new LinkedList();
                
                if (bfs.size()>0) {
                    bfs.addLast(null);
                }
                
                is_order_left = !is_order_left;
                
            }
            
            
        }
            return sol;

        
        
    }
}