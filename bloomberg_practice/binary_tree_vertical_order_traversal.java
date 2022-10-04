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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }
        
        Queue<Pair<TreeNode,Integer>> nodeAndColumn = new LinkedList<>();
        
        nodeAndColumn.add(new Pair<>(root, 0));
        int level = 0;
        List<List<Integer>> verticalOrder = new ArrayList<>();
       
        int minColumn = 0, maxColumn = 0;
        Map<Integer,List<Integer>> nodesAtParticularColumn = new HashMap<>();
        
        while(!nodeAndColumn.isEmpty()){
            
            Pair<TreeNode,Integer> pair = nodeAndColumn.remove();
            TreeNode current = pair.getKey();
            int currentColumn = pair.getValue();
            minColumn = Math.min(currentColumn, minColumn);
            maxColumn = Math.max(currentColumn, maxColumn);
            
            if(!nodesAtParticularColumn.containsKey(currentColumn)){
                nodesAtParticularColumn.put(currentColumn, new ArrayList<>());
            }
            
            nodesAtParticularColumn.get(currentColumn).add(current.val);

            if(current.left != null){
                nodeAndColumn.add(new Pair<>(current.left, currentColumn-1));
            }
            if(current.right != null){
                nodeAndColumn.add(new Pair<>(current.right, currentColumn+1));
            }

        }
        
       
        for(int column = minColumn; column<= maxColumn; column++){
            verticalOrder.add(nodesAtParticularColumn.get(column));
        }
        
        
        return verticalOrder;
    }
}
