// very very basic and long-winded solution

class Solution {
    
    public boolean isValidSudoku(char[][] board) {
    
        for (int i = 0; i < 9; i++) {
            char[] currRow = new char[9];
            char[] currCol = new char[9];
            for (int j = 0; j < 9; j++) {
                currRow[j] = board[i][j];
                currCol[j] = board[j][i];
            }
                
            if ( !(check9(currRow) && check9(currCol)) ) {
                return false;
            }
        } 
        
        return checkBox(board);
         
    }
    
    
    private boolean check9(char[] chars){
        HashSet<Character> mySet = new HashSet<>();
        for (char c : chars) {
            if (c == '.') continue;
            if (Character.isDigit(c)) {
                if (!mySet.add(c)) {
                    return false;
                }
            } else {
                return false;
            } 
        }
        return true;
    }
    
    
    private boolean checkBox(char[][] board) {
        int[][] startBox = new int[][]{
            new int[]{0,0},
            new int[]{0,3},
            new int[]{0,6},
            new int[]{3,0},
            new int[]{3,3},
            new int[]{3,6},
            new int[]{6,0},
            new int[]{6,3},
            new int[]{6,6},
        };
        
        for (int[] pair : startBox){
            char[] currBox = new char[9];
            int count = 0;
            for (int p = pair[0]; p < pair[0]+3; p++) {
                for (int q = pair[1]; q < pair[1]+3; q++){
                    currBox[count] = board[p][q];
                    count++;
                }
            }
            
            if (!check9(currBox)) {
                return false;   
            }
        }
        return true;
    }
    
}
