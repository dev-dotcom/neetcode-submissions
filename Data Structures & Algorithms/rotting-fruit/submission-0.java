class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int ROWS = grid.length;
        int COLS = grid[0].length;

        int time = 0;
        int fresh = 0;

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    q.offer(new int[] {i,j});
                }
            }
        }

        int[][] dirs = {{-1,0}, {0,-1},{1,0},{0,1}};

        while(!q.isEmpty() && fresh > 0){

            int length = q.size();
            for (int i = 0; i < length; i++) {

                int[] node = q.poll();

                int row = node[0];
                int col = node[1];

                for(int[] dir : dirs){

                    int r = row + dir[0];
                    int c = col + dir[1];

                   if (r >= 0 && r < grid.length &&
    c >= 0 && c < grid[0].length &&
    grid[r][c] == 1) {

    grid[r][c] = 2;
    q.offer(new int[]{r, c});
    fresh--;
}

                }   
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}
