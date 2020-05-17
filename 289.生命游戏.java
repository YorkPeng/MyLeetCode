/*
 * @lc app=leetcode.cn id=289 lang=java
 *
 * [289] 生命游戏
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0){
            return;
        }
        int m = board.length;
        int n = board[0].length;
        int[] temp = new int[m*n];
        int k = 0;
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                int count = isVaild(i-1, j, board) + isVaild(i+1, j, board) + isVaild(i, j-1, board) + isVaild(i, j+1, board)
                + isVaild(i-1, j-1, board) + isVaild(i-1, j+1, board) + isVaild(i+1, j-1, board) + isVaild(i+1, j+1, board);
                if(board[i][j] == 0 && count == 3){
                    temp[k++] = 1;
                }else if(board[i][j] == 1){
                    if(count<2 || count >3){
                        temp[k++] = 0;
                    }else{
                        temp[k++] = 1;
                    }
                }else{
                    temp[k++] = 0;
                }
            }
        }
        k = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = temp[k++];
            }
        }
    }

    private int isVaild(int i, int j, int[][] board){
        if(i<0 || j < 0 || i >= board.length || j >=board[0].length){
            return 0;
        }
        return board[i][j];
        
    }
}
// @lc code=end

