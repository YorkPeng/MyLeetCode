/*
 * @lc app=leetcode.cn id=1248 lang=java
 *
 * [1248] 统计「优美子数组」
 */

// @lc code=start
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <1){
            return 0;
        }
        ArrayList<Integer> index = new ArrayList<>();
        int res = 0;
        index.add(-1);
        for(int i = 0;i < nums.length;i++) {
            if (nums[i] % 2 == 1) {
                index.add(i);
            }
        }
        index.add(nums.length);
        for(int i = 1; i < index.size()-k;i++){
            int left = index.get(i) - index.get(i-1);
            int right = index.get(i+k) - index.get(i+k-1);
            res += left*right;
        }
        return res;
    }
}
// @lc code=end

