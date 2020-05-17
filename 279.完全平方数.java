/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i < n+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i = 1;i < n+1;i++){
            for(int j = 1;j<=i;j++){
                if(i - j*j >=0){
                    dp[i] = Math.min(dp[i], dp[i- j*j]+1);
                }else{
                    break;
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

