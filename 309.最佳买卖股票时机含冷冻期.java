/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if( prices == null || prices.length == 0){
            return 0;
        }
        //有三种状态，0为不持有，1为持有，2为等待
        int [][] max = new int[prices.length][3];
        max[0][0] = 0;
        max[0][1] = -prices[0];
        max[0][2] = 0;
        for(int i =1;i<prices.length;i++){
            max[i][0] = max[i-1][1] + prices[i];
            max[i][1] = Math.max(max[i-1][1], max[i-1][2]-prices[i]);
            max[i][2] = Math.max(max[i-1][2],max[i-1][0]);
        }
        return Math.max(max[prices.length-1][0], max[prices.length-1][2]);
    }
}
// @lc code=end

