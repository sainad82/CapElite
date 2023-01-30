class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
		if(root==null) {
			return arr;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		boolean isForward = true;
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> array = new LinkedList<>();
			for(int i=0;i<size;i++) {
				TreeNode curr = queue.poll();
				if(isForward) {
					array.add(curr.val);
				}
				else {
					array.add(0,curr.val);
				}
				if(curr.left!=null) {
					queue.add(curr.left);
				}
				if(curr.right!=null) {
					queue.add(curr.right);
				}

			}
            arr.add(array);
			isForward = !isForward;
			

		}
		return arr;
    }
}
