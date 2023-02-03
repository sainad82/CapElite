class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        
        return helper(root,key);
        
    }
    TreeNode helper(TreeNode node,int value){
        if(node==null){
            return node;
        }
        if(node.val>value){
            node.left = helper(node.left,value);
        }
        else if(node.val<value){
            node.right = helper(node.right,value);
        }
        else{
            
            if(node.left==null){
                return node.right;
            }
            else if(node.right==null){
                return node.left;
            }
            else{
                int leftMax = predecessor(node.left);
                node.val = leftMax;
                node.left = helper(node.left,leftMax);
            }
        }
        return node;

    }
    public int predecessor(TreeNode predcr){
        while(predcr.right!=null){
            predcr = predcr.right;
        }
        return predcr.val;
    }

}
