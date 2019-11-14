/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
   List<Integer> ans = new ArrayList<Integer>();

     public void helper(Node root) {

        for (Node cur: root.children             ) {
            helper(cur);
        }
        ans.add(root.val);

    }

 public List<Integer> postorder(Node root) {
        if (root == null) {
            return ans;
        }
        helper(root);
        return ans;
    }
}
