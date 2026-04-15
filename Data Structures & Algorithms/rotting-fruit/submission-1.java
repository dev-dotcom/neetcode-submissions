class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 1){
                    fresh++;
                }
                if(grid[r][c] == 2){
                    q.offer(new int[] {r,c});
                }
            }
        }

        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while(!q.isEmpty() && fresh > 0){
            int length   = q.size();
            for(int i = 0; i < length; i++){
                int[] node = q.poll();
                int cr = node[0];
                int cc = node[1];

                for(int[] dir : dirs){
                    int nr  = cr + dir[0];
                    int nc = cc + dir[1];

                    if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}
