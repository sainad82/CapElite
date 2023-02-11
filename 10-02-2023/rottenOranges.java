class Solution {
    class Pair{
        int rownum;
        int colnum;
        Pair(int rownum,int colnum){
            this.rownum = rownum;
            this.colnum = colnum;
        }
    }
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        //rotten oranges at start
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j));
                }
            }
        }
        int time=-1;
        int[] xoffset = {-1,0,1,0};
        int[] yoffset = {0,-1,0,1};
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                Pair p = queue.poll();
                int row1 = p.rownum;
                int col1 = p.colnum;
                for(int k=0;k<4;k++){
                    int m = row1+xoffset[k];
                    int n = col1+yoffset[k];
                    if(m<0 || n<0 || m>=row || n>=col){
                        continue;
                    }
                    if(grid[m][n]==1){
                        queue.add(new Pair(m,n));
                        grid[m][n]=2;
                    }

                }
            }
            time++;
        }
        for(int l=0;l<row;l++){
            for(int g=0;g<col;g++){
                if(grid[l][g]==1){
                    return -1;
                }
            }
        }
        if(time==-1){
            return 0;
        }
        return time;

    }
}
