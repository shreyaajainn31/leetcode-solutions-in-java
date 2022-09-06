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
    
    TreeNode prev;
    boolean inorder(TreeNode root){
        if(root == null){
            return true;
        }
        
        boolean left = inorder(root.left);
        
        if(prev != null && root.val <= prev.val){
            return false;
        }
        
        prev = root;
      
        boolean right = inorder(root.right);
        
        return left && right;
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        prev = null;
        return inorder(root);
    
    }
}
