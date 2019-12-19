/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int fast =0,slow = 0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(fast == slow){
                fast = 0;
                while(fast != slow){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return fast;
            }
        }
    }
}
// @lc code=end

