import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}

