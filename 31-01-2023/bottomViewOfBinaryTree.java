class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<Node> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        root.hd = 0;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++) 
            {
                Node curr = queue.poll();
                int hd = curr.hd;
                map.put(hd,curr.data);
                if(curr.left!=null) 
                {
                    queue.add(curr.left);
                    curr.left.hd = hd-1;
                    
                }
                if(curr.right!=null) 
                {
                    queue.add(curr.right);
                    curr.right.hd = hd+1;
                }
            }
        }
        for(int i:map.values()) 
        {
            arr.add(i);
        }
        return arr;
    }
}
