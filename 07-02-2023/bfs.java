class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.offer(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                int front = queue.poll();
                arr.add(front);
                for(int val:adj.get(front)){
                    if(!visited[val]){
                        visited[val] = true;
                        queue.add(val);
                    }
                }
            }
        }
        return arr;
    }
}
