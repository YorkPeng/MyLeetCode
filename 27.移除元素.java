/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int id = 0;
        for(int num : nums){
            if(num != val){
                nums[id++] = num;
            }
        }
        return id;
    }
}

