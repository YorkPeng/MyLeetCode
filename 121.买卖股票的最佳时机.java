/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        // 一次遍历，只需要考虑数组中最小值以及该值以后最大的值，其差为最大利润
        for(int i = 0; i < prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if (prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
// @lc code=end

