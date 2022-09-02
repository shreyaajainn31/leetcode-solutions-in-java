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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> list = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        Double sum = 0.0;
        Double total = 0.0;
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current != null){
                sum +=current.val;
                total++;
                if(current.left != null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            else{
                list.add(sum/total);
                sum = 0.0;
                total = 0.0;
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        
        return list;
    }
}
