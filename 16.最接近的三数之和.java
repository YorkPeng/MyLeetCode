/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        boolean first = true;
        for(int i = 0; i <= nums.length-3;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
                int temp = nums[i] + nums[low] + nums[high];
                if(first){
                    res = temp;
                    first = !first;
                }else{
                    res = Math.abs(target-res)>Math.abs(target-temp)?temp:res;
                }
                if(temp-target < 0){
                    low++;
                }else if(temp - target > 0){
                    high--;
                }else{
                    return target;
                }
            }
        }
        return res;
    }
}
// @lc code=end

