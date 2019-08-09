// an improved verion

class Solution {   
    public boolean isValidSudoku(char[][] board) {
          
        boolean[][][] filled = new boolean[3][9][9];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.') {
                    int num = board[i][j]-'1';
                    int boxId = (i/3)*3+j/3;
                    if (filled[0][i][num] || filled[1][j][num] || filled[2][boxId][num]) return false;
                    else filled[0][i][num] = filled[1][j][num] = filled[2][boxId][num] = true;
                }     
            }
        }
        
        return true;
        
    } 
}
