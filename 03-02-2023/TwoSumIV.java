class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return helper(root,set,k);
    }
    boolean helper(TreeNode node,Set<Integer> set1,int key){
        if(node==null){
            return false;
        }
        if(!set1.contains(key-node.val)){
            set1.add(node.val);
        }
        else{
            return true;
        }
        boolean left = helper(node.left,set1,key);
        boolean right = helper(node.right,set1,key);
        return left || right;
    }
}
