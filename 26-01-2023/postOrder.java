class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        postOrder(arr,root);
        return arr;
    }
    void postOrder(ArrayList<Integer> array,TreeNode node) {
        if(node==null) {
            return;
        }
        postOrder(array,node.left);
        postOrder(array,node.right);
        array.add(node.val);
    }
}
