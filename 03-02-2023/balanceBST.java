class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorderTraversal(root,arr);
        return balanceTree(arr,0,arr.size()-1);
        
    }
    void inorderTraversal(TreeNode node,List<Integer> array){
        if(node==null){
            return ;
        }
        inorderTraversal(node.left,array);
        array.add(node.val);
        inorderTraversal(node.right,array);
    }
    TreeNode balanceTree(List<Integer> list,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode newNode = new TreeNode(list.get(mid));
        newNode.left = balanceTree(list,left,mid-1);
        newNode.right = balanceTree(list,mid+1,right);
        
        return newNode;

    }

}
