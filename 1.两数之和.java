import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> map = new HashMap<>();
     for(int i = 0; i < nums.length; i++){
         int temp = target-nums[i];
         if(map.containsKey(temp)){
             return new int[] {i,map.get(temp)};
         }
         map.put(nums[i],i);
    }
    return new int[] {0,0};
    }
}
// @lc code=end

