class Solution {

    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c< grid[0].length; c++){
                if(grid[r][c] == 1){
                    area = Math.max(area,bfs(grid,r,c));
                }
            }
        }
        return area;
    }

    private int bfs(int[][] grid, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {r,c});
        grid[r][c] = 0;
        int res = 1;

        while(!q.isEmpty()){

            int[] node  = q.poll();
            int cr = node[0];
            int cc = node[1];

            for(int[] dir : directions){
                int nr = cr + dir[0];
                int nc = cc + dir[1];

                if(nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == 1){
                    q.offer(new int[]{nr,nc});
                    grid[nr][nc] = 0;
                    res++;
                }
            }

        }
        return res;

    }

}
