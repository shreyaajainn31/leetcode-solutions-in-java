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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return root;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            TreeNode temp = current.right;
            current.right = current.left;
            current.left = temp;
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }        
        }
        
        return root;
    }
}
