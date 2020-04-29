/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        int location = -1;
        while(left <= right){
            mid = left + (right-left)/2;
            if(nums[mid] == target){
                location = mid;
                break;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(location == -1){
            return new int[] {-1,-1};
        }else{
            left = location-1;
            right = location +1;
            int[] result = new int[2];
            while(left>=0 && nums[left] == nums[left+1]){
                left--;
            }
            while(right < nums.length && nums[right] == nums[right-1]){
                right++;
            }
            if(left == -1){
                if(right == nums.length && nums[right-1]!=target){
                    result[0]=-1;
                    result[1]=-1;
                }else{
                    result[0]=right-1;
                    result[1]=right-1;
                }
            }else{
                if(right == nums.length && nums[right-1]!=target){
                    result[0]=left+1;
                    result[1]=left+1;
                }else{
                    result[0]=left+1;
                    result[1]=right-1;
                }
            }
            return  result;
        }
    }
}
// @lc code=end

