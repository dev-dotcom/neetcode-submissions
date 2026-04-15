class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == 0){
                    q.offer(new int[]{r,c});
                }
            }
        }

        if(q.size() == 0) return;
        int[][] dirs = {{ -1, 0 }, { 0, -1 },
                         { 1, 0 }, { 0, 1 } };

        while(!q.isEmpty()){
            int[] node = q.poll();

            int cr = node[0];
            int cc = node[1];

            for(int[] dir : dirs){
                int nr = cr + dir[0];
                int nc = cc + dir[1];

                if(nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || grid[nr][nc] !=  Integer.MAX_VALUE){
                    continue;
                }
                grid[nr][nc] = grid[cr][cc] + 1;
                q.offer(new int[]{nr,nc});
            }
        }
    }
}
