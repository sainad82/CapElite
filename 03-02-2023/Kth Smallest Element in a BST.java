class Solution {
    private Stack<TreeNode> stack = new Stack<>();
    private int kth = 0;
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        while(true){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode top = stack.pop();
            kth++;
            if(kth==k){
                return top.val;
            }
            curr = top.right;
        }
    }
}
