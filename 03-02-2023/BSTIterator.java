class BSTIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmp = stack.pop();
        pushAll(tmp.right);
        return tmp.val;
    }
    
    public boolean hasNext() {
        if(!stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void pushAll(TreeNode node){
        while(node!=null){
            stack.push(node);
            node = node.left;
        }
    }
}
