class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean helper(TreeNode root1,long lowLim,long UpLim){
        if(root1==null){
            return true;
        }
        boolean left = helper(root1.left,lowLim,root1.val);
        boolean right = helper(root1.right,root1.val,UpLim);
        return left && right && root1.val>lowLim && root1.val<UpLim;
    }
}
