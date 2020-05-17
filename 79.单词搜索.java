/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.length() == 0){
            return false;
        }
        int[][] direction = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0;i < board.length;i++){
            for(int j = 0; j < board[i].length;j++){
                if(travel(board, word, 0, visited, direction, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean travel(char[][] board, String word, int pos, boolean[][] visited, int[][] direction,int i , int j){
        if(i<0||i>=board.length || j<0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(pos)){
            return false;
        }
        if(pos == word.length()-1){
            return true;
        }
        visited[i][j] = true;
        boolean flag = false;
        for(int k = 0; k< 4;k++){
            int newX = i+direction[k][0];
            int newY = j+direction[k][1];
            flag = travel(board, word, pos + 1, visited, direction, newX, newY) || flag;
        }
        if(!flag){
            visited[i][j] = false;
        }
        return flag;
    }
}
// @lc code=end

