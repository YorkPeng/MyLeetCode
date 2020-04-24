/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        for(int i = 0;i<=right;i++){
            if(nums[i] == 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }else if(nums[i] == 2){
                int temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
                i--;
            }
        }
    }
}
// @lc code=end

