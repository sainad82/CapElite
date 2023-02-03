class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        class Pair{
            int offset;
            Node node;
            Pair(int ofset,Node val){
                offset = ofset;
                node = val;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0,root));
        Map<Integer,Integer> map = new TreeMap<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Pair front = queue.poll();
                int oset = front.offset;
                Node curr = front.node;
                if(!map.containsKey(oset)){
                    map.put(oset,curr.data);
                }
                if(curr.left!=null){
                    queue.add(new Pair(oset-1,curr.left));
                }
                if(curr.right!=null){
                    
                    queue.add(new Pair(oset+1,curr.right));
                    
                }
            }
        }
        for(int val:map.values()){
            arr.add(val);
        }
        return arr;
        
    }
}
