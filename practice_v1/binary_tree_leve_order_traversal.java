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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> currentLevel = new ArrayList<>();
        while(!queue.isEmpty()){
            
            TreeNode current = queue.remove();
            if(current != null){
                currentLevel.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            else{
                list.add(currentLevel);
                currentLevel = new ArrayList<>();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
        }
        
        return list;
    }
}
