import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        subSet(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void subSet(int[] nums, int start, List<Integer> temp, List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            subSet(nums, i+1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

