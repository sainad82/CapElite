class Solution {
    class Pair{
        int rownum;
        int colnum;
        Pair(int rownum,int colnum){
            this.rownum = rownum;
            this.colnum = colnum;
        }
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] matrix,int r,int c,boolean[][] visit){
        visit[r][c] = true;
        int[] roffset = {-1,0,1,0};
        int[] coffset = {0,1,0,-1};
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(r,c));
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            int ro1 = p.rownum;
            int co1 = p.colnum;
            for(int l=0;l<4;l++){
                int updrow = ro1+roffset[l];
                int updcol = co1+coffset[l];
                if(updrow<0 || updcol<0 || updrow>=matrix.length || updcol>=matrix[0].length){
                    continue;
                }
                if(!visit[updrow][updcol] && matrix[updrow][updcol]=='1'){
                    queue.offer(new Pair(updrow,updcol));
                    visit[updrow][updcol] = true;
                }
            }
        }
    }
}
