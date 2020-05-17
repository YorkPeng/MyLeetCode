/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length==1){
            return nums[0] == target?0:-1;
        }
        int i = 0;
        int j = nums.length -1;
        int mid = 0;
        if (nums[0] >= nums[j]) {
            int place = 0;
            while (i <= j) {
                mid = i + (j - i) / 2;
                if (nums[mid] >= nums[0]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
            place = i;
            if (target >= nums[0]) {
                i = 0;
                j = place - 1;
            } else {
                i = place;
                j = nums.length - 1;
            }
        }
        while(i<=j){
            mid = i+(j-i)/2;
            if(nums[mid]== target){
                return mid;
            }else if(target > nums[mid]){
                i = mid+1;
            }else {
                j = mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

