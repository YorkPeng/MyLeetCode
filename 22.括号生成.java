import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String str = "";
        int count1 = 0;
        int count2 = 0;
        backTracking(result, str, count1, count2, n);
        return result;
    }

    public void backTracking(List<String> result, String str, int count1, int count2, int n){
        if(count1>n || count2>n){
            return;
        }
        if(count1 == n && count2 == n){
            result.add(str);
            return;
        }
        if(count1>=count2){
            String str2 = new String(str);
            backTracking(result, str+"(", count1+1, count2, n);
            backTracking(result, str2+")", count1, count2+1, n);
        }

    }
}
// @lc code=end

