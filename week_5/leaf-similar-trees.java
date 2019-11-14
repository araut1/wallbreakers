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
           private List<Integer> list1 = new ArrayList<>();
       private List<Integer> list2 = new ArrayList<>();

       public void preOrder1(TreeNode root) {

        if(root == null){
            return;
        }
        preOrder1(root.left);
        if(root.left == null && root.right == null)
        list1.add(root.val);
        preOrder1(root.right);
    }

        public void preOrder2(TreeNode root) {

        if(root == null){
            return;
        }
        preOrder2(root.left);
        if(root.left == null && root.right == null)
            list2.add(root.val);
        preOrder2(root.right);
    }


     public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if((root1 != null && root2 == null)||(root1 == null && root2 != null)){
            return false;
        }
        preOrder1(root1);
        preOrder2(root2);

               if (list1.size() == list2.size()) {
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i) != list1.get(i)) {
                    return false;
                }
            }
           
        } else{
            return false;
        }
        return true;


    }
}
