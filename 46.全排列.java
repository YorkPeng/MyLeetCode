import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        backTracking(result, temp, nums, 0);
        return result;
    }

    public void backTracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int pos){
        if(temp.size() == nums.length){
            ArrayList<Integer> res = new ArrayList<>(temp);
            result.add(res);
            return;
        }
        for(int i = 0; i< nums.length;i++){
            if(!temp.contains(nums[i])) {
                temp.add(nums[i]);
                backTracking(result, temp, nums, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
// @lc code=end

