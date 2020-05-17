/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int count = 1;
        for(int i = 1; i < nums.length;i++){
            if(nums[i]>nums[i-1]){
                int k = i-1;
                int index = 0;
                int lastBig = Integer.MIN_VALUE;
                for(;k>=i-count;k--){
                    if(nums[k] <nums[i] && nums[k]>lastBig){
                        index = k;
                        lastBig = nums[k];
                    }
                }
                dp[i] = dp[index]+1;
                count = Math.max(count,dp[i]);
            }else if(nums[i]<=nums[i-1]){
                int j = i;
                for(;j>=0;j--){
                    if(nums[j] < nums[i]){
                        dp[i] = dp[j]+1;
                        break;
                    }
                }
                if(j == -1){
                    dp[i] = 1;
                }
            }
        }
        return count;
    }
}
// @lc code=end

