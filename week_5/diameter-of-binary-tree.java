/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
      
     public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lHeight = 1 + height(root.left);


        int rHeight = 1 + height(root.right);

        return Math.max(lHeight, rHeight);

    }

     public int dim(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int lHeight = height(root.left);


        int rHeight = height(root.right);


        int leftD = dim(root.left);
        int leftR = dim(root.right);


        return Math.max(1 + (lHeight + rHeight), Math.max(leftR, leftD));
    }

     public int diameterOfBinaryTree(TreeNode root) {
 if (root == null) {
            return 0;
        }

        return dim(root) - 1;
    }
}
