import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(result, temp, 1, n, k);
        return result;
    }

    public void backTracking(List<List<Integer>> result, List<Integer> temp, int count, int n, int k) {
        if (temp.size() == k) {
            List<Integer> ans = new ArrayList<>(temp);
            result.add(ans);
            return;
        }
        for (int i = count;i<=n;i++){
            temp.add(i);
            backTracking(result, temp, i+1, n, k);
            temp.remove(temp.size()-1);
        }
    }
}
// @lc code=end

