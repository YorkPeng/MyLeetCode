/*
 * @lc app=leetcode.cn id=686 lang=java
 *
 * [686] 重复叠加字符串匹配
 */

// @lc code=start
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder sb = new StringBuilder(A);
        while(sb.length() < B.length()){
            sb.append(A);
            count++;
        }
        if(sb.indexOf(B) != -1){
            return count;
        }
        sb.append(A);
        count++;
        return sb.indexOf(B)==-1?-1:count;
    }
}
// @lc code=end

