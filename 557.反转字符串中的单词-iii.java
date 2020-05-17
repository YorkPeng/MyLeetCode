/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length;i++){
            StringBuffer temp = new StringBuffer(str[i]);
            temp = temp.reverse();
            sb.append(temp + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
// @lc code=end

