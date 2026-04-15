class Solution {

    private static final int[][] directions = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };
    public void solve(char[][] board) {
        capture(board);

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == 'T') {
                    board[r][c] = 'O';
                }
            }
        }

    }

    private void capture(char[][] board){
        Queue<int[]> q = new LinkedList<>();
        for(int r =0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if((r == 0 || r == board.length -1 || c == 0 || c == board[0].length -1 ) &&  board[r][c] == 'O'){
                    q.offer(new int[] {r,c});
                }
            }
        }

        while(!q.isEmpty()){
            int[] node  = q.poll();
            int cr = node[0];
            int cc = node[1];

            if(board[cr][cc] == 'O'){
                board[cr][cc] = 'T';

                for(int[] dir : directions){
                    int nr = cr + dir[0];
                    int nc = cc + dir[1];

                    if(nr >= 0 && nr < board.length && nc >=0 && nc < board[0].length){
                        q.offer(new int[] {nr,nc});
                    }
                }
            }
        }
    }
}
