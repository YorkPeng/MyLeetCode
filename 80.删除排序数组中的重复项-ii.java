/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int id = 0;
        for(int num:  nums){
            if(id <=1 || num > nums[id-2]){
                nums[id++] = num;
            }
        }
        return id;
    }
}

