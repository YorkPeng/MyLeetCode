/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] result = new int[n][m];
        result[n-1][m-1] = 1;
        for(int i = n-1; i >=0;i--){
            for(int j = m-1; j >=0;j--){
                if(i == n-1 && j == m-1){
                    continue;
                }
                if(i+1>=n){
                    result[i][j] += result[i][j+1];
                }
                if(j+1>=m){
                    result[i][j] += result[i+1][j];
                }
                if(i+1<n && j+1<m){
                    result[i][j] = result[i][j] + result[i][j+1] + result[i+1][j];
                }
            }
        }
        return result[0][0];
    }
}
// @lc code=end

