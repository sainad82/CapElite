class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int[] arr,int left,int right){
        if(left>right){
            return null;
        }
        int mid = left+(right-left)/2;
        TreeNode node = new TreeNode(arr[mid],helper(arr,left,mid-1),helper(arr,mid+1,right)); 
        return node;
    }
}
