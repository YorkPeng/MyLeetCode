/*
 * @lc app=leetcode.cn id=329 lang=java
 *
 * [329] 矩阵中的最长递增路径
 */

// @lc code=start
class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int result= 0;
        for(int i = 0;i < row;i++){
            for(int j = 0; j < col;j++){
                result = Math.max(result,dfs(matrix, dp, i, j, Integer.MIN_VALUE));
            }
        }
        return result;
    }

    private int dfs(int[][] matrix,int[][] dp,int i,int j,int pre){
        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length||matrix[i][j]<=pre){
            return 0;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int max = 0;
        pre = matrix[i][j];
        max = Math.max(max,dfs(matrix, dp, i-1, j, pre));
        max = Math.max(max, dfs(matrix, dp, i+1, j, pre));
        max = Math.max(max,dfs(matrix, dp, i, j-1, pre));
        max = Math.max(max,dfs(matrix, dp, i, j+1, pre));
        dp[i][j] = max+1;
        return dp[i][j];
    }
}
// @lc code=end

