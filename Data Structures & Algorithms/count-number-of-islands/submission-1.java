class Solution {

    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int count = 0;

        for(int r = 0; r < ROWS; r++){
            for(int  c = 0; c < COLS; c++){
                if(grid[r][c] == '1'){
                    count++;
                    bfs(grid,r,c);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int r, int c){

        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.offer(new int[]{r,c});

        while(!q.isEmpty()){
            int[] node = q.poll();
            int cr = node[0];
            int cc = node[1];
            
            for(int[] dir : directions){
                int nr = cr + dir[0];
                int nc = cc + dir[1];

                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == '1'){
                    grid[nr][nc] = '0';
                    q.offer(new int[]{nr,nc});
                }
            }

        }

    }
}
