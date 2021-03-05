package March_Leetcode_Challenge;

/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.

Question link: https://leetcode.com/problems/average-of-levels-in-binary-tree/

 */
import java.util.*;
public class Day5 {

    static class TreeNode
    {
        int val;
        TreeNode left, right;

        public TreeNode(int item)
        {
            val = item;
            left = right = null;
        }
    }

    // A Java program to introduce Binary Tree
    static class BinaryTree
    {
        // Root of Binary Tree
        TreeNode root;

        // Constructors
        BinaryTree(int key)
        {
            root = new TreeNode(key);
        }

        BinaryTree()
        {
            root = null;
        }

        public static List<Double> averageOfLevels(TreeNode root) {

            List<Double> ans = new ArrayList<>();

            if(root == null){
                return ans;
            }

            Queue<TreeNode> q = new LinkedList<>();
            int nodes = 0;
            double sum = 0;
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){

                TreeNode current = q.poll();
                if(current != null){
                    nodes++;
                    sum+=current.val;
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if(current.right != null){
                        q.add(current.right);
                    }
                }
                else{
                    double avg = sum / nodes;
                    nodes = 0;
                    sum = 0;
                    ans.add(avg);
                    if(!q.isEmpty())
                        q.add(null);
                }
            }

            return ans;
        }
        public static void main(String[] args)
        {
            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(3);


            tree.root.left = new TreeNode(9);
            tree.root.right = new TreeNode(20);

            tree.root.right.left = new TreeNode(15);
            tree.root.right.right = new TreeNode(7);
            System.out.println(averageOfLevels(tree.root));

        }
    }


}
