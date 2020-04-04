/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        Long A = Long.parseLong(num1);
        Long B=Long.parseLong(num2);
        Long C = A*B;
        return String.valueOf(C);
    }
}
// @lc code=end

