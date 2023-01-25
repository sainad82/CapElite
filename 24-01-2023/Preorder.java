class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        traversal(arr,root);
        return arr;
    }
    void traversal(ArrayList<Integer> preorder,TreeNode node) {
        if(node==null) {
            return;
        }
        preorder.add(node.val);
        traversal(preorder,node.left);
        traversal(preorder,node.right);
    }
}
