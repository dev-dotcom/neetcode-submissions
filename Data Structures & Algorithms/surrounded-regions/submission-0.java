class Solution {

    private int ROWS, COLS;
    private int[][] directions = new int[][]{
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };
    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;

        capture(board);

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void capture(char[][] board){
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(i == 0 || i == ROWS - 1 || j == 0 || j == COLS - 1 && board[i][j] == 'O'){
                    q.offer(new int[] {i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int[] cell = q.poll();

            int r = cell[0];
            int c = cell[1];

            if(board[r][c] == 'O') {
                board[r][c] = 'T';

                for(int[] dir : directions){

                    int nr = dir[0] + r;
                    int nc = dir[1] + c;

                    if(nr >= 0 && nr < ROWS && nc >= 0 && nc < COLS){
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
    }
}
