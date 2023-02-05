class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) {
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left && right && Math.abs(height(root.left)-height(root.right))<=1;
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;
    }
}
