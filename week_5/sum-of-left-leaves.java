class Solution {
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }
        sumCal(root,false);
        return sum;
    }
    private void sumCal(TreeNode node,boolean left){
        if (node==null) return;
        if (node.left==null && node.right==null && left){
            sum+=node.val;
        }

        sumCal(node.left,true);
        sumCal(node.right,false);
        
    }
}
