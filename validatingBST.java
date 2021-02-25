package trees;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.


Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1


Question link: https://leetcode.com/problems/validate-binary-search-tree/
 */

import java.util.*;
public class validatingBST {

    private class TreeNode{

        int data;
        TreeNode left, right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root = null;

    private void insert(int data){

        TreeNode node = new TreeNode(data);
        if(root == null){
            root = node;
            return;
        }

        TreeNode curr = root;
        while(true){
            if(data < root.data){
                if(curr.left == null){
                    curr.left =  node;
                    break;
                }
                curr = curr.left;
            }
            else{
                if(curr.right == null){
                    curr.right = node;
                    break;
                }
                curr = curr.right;
            }

        }

    }

    public boolean isValidBST(){

        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }

        if(root.data <= min || root.data >= max){
            return false;
        }

        boolean leftTree = isValidBST(root.left, min, root.data);
        boolean  rightTree = isValidBST(root.right, root.data, max);

        return leftTree && rightTree;
    }
    public static void main(String[] args) {

        validatingBST tree = new validatingBST();

        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        System.out.println(tree.isValidBST());

    }




}
