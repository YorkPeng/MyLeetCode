/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0){
            return new int[0][0];
        }
        int[][] res = new int[n][n];
        int max = n*n;
        int count = 1;
        int pos = 0;
        while(count <= max){
            for(int i = pos; i <= n-1-pos;i++){
                res[pos][i] = count;
                count++;
            }
            for (int i = pos+1;i <= n -pos-1;i++){
                res[i][n-pos-1] = count;
                count++;
            }
            for (int i = n-2-pos;i>=pos;i--){
                res[n-pos-1][i] = count;
                count++;
            }
            for (int i = n-2-pos;i > pos;i--){
                res[i][pos] = count;
                count++;
            }
            pos++;
        }
        return res;
    }
}
// @lc code=end

