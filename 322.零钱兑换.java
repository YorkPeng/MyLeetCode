/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i = 1; i < amount+1; i++){
            dp[i] = amount+1;
        }
        dp[0]=0;
        for(int i = 1; i < amount+1; i++){
            for(int j = 0; j < coins.length; j++){
                if(i-coins[j] >= 0){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
// @lc code=end

