class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr =new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        return helper(arr,0,arr.size()-1);
        
    }
    TreeNode helper(List<Integer> array,int low,int high){
        if(low>high){
            return null;
        }
        int mid = low+(high-low)/2;
        TreeNode curr = new TreeNode(array.get(mid));
        curr.left = helper(array,low,mid-1);
        curr.right = helper(array,mid+1,high);
        return curr;
    }
}
