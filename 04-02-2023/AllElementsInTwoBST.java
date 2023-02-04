class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();
        if(root1==null && root2==null){
            return arr;
        }
        inorder(root1,arr);
        inorder(root2,arr);
        Collections.sort(arr);
        return arr;
    }
    void inorder(TreeNode node,List<Integer> array){
        if(node==null){
            return ;
        }
        inorder(node.left,array);
        array.add(node.val);
        inorder(node.right,array);
    }
}
