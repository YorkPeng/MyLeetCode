/*
 * @lc app=leetcode.cn id=466 lang=java
 *
 * [466] 统计重复个数
 */

// @lc code=start
class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int j = 0;
        while(count1 < n1){
            for (char c : str1) {
                if (c == str2[j]) {
                    j++;
                    if (j == str2.length) {
                        count2++;
                        j = 0;
                    }
                }
            }
            count1++;
        }
        return count2/n2;
    }
}
// @lc code=end

