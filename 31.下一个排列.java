/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return;
        }
        int fast = 1;
        int slow = 0;
        int current = 0;
        int minValue = Integer.MAX_VALUE;
        while(fast < nums.length){
            if(nums[fast] > nums[fast-1]){
                slow = fast-1;
                minValue = Integer.MAX_VALUE;
            }
            if(Math.min(minValue, nums[fast]) == nums[fast] && nums[fast] > nums[slow]){
                current = fast;
                minValue = nums[fast];
            }
            fast++;
        }
        int temp = nums[current];
        nums[current] = nums[slow];
        nums[slow] = temp;
        if( slow==0 && current == 0){
            fastSort(nums, slow, fast-1);
        }else{
            fastSort(nums,slow+1,fast-1);
        }

    }
    private void fastSort(int[] nums, int l, int r){
        if(l >= r){
            return;
        }
        int left = l;
        int right =r;
        int key = nums[l];
        while(left < right){
            while(left<r &&  nums[left] <= key){
                left++;
            }
            while(right>l && nums[right] >= key){
                right--;
            }
            if(left>=right){
                break;
            }
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        int temp = nums[right];
        nums[right] = nums[l];
        nums[l] = temp;
        fastSort(nums, l, right-1);
        fastSort(nums, right+1, r);
    }
}
// @lc code=end

