import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i], i);
        }
        
        Arrays.sort(nums);
        String[] result = new String[nums.length];

        for(int i = nums.length-1; i>=0;i--){
            if(i == nums.length-1){
                result[map.get(nums[i])] = "Gold Medal";
            }else if( i == nums.length-2){
                result[map.get(nums[i])] = "Silver Medal";
            }else if( i == nums.length-3){
                result[map.get(nums[i])] = "Bronze Medal";
            }else{
                result[map.get(nums[i])] = String.valueOf(nums.length-i);
            }
        }

        return result;
    }
}
// @lc code=end

