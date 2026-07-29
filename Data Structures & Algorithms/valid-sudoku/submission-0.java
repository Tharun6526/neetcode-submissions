class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> mpp = new HashSet<>();
        for(int i =0;i<9;i++){
            for(int j = 0;j<9;j++){
                char c = board[i][j];
                if(board[i][j]=='.'){
                    continue;
                }
                if(!mpp.add(c +"row" + i) || !mpp.add(c +"col"+j) || !mpp.add(c +"box" + i/3 + j/3)){
                    return false;
                } 
            }
        }
            return true;

    }
}
