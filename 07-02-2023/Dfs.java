class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> arr = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean[V];
        
        dfs(0,visited,adj);
        
        return arr;
    }
    void dfs(int vertex,boolean[] array,ArrayList<ArrayList<Integer>> list){
        array[vertex] = true;
        arr.add(vertex);
        for(int val:list.get(vertex)){
            if(!array[val]){
                dfs(val,array,list);
            }
        }
    }
}
