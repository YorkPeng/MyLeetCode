/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int id = 0;
        for(int num : nums){
            if(id == 0 || nums[id-1] < num){
                nums[id++] = num;
            }
        }
        return id;
    }
}

