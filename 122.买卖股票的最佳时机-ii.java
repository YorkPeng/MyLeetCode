/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        //本题大体思路与121相同，但是多了个可以多次买卖的功能。
        //在刚开始做的时候考虑复杂了，考虑应该什么时候卖出
        //但是事实上可以当天卖出再买入。
        for(int i =0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > 0){
                max += prices[i] - min;
                min = prices[i];
            }
        }
        return max;
    }
}
// @lc code=end

