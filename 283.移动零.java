/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int id = 0;
        for(int num: nums){
            if(num != 0){
                nums[id++] = num;
            }
        }
        while(id < nums.length){
            nums[id++] = 0;
        }
    }
}

