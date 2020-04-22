/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int start = 0;
        int length = s.length();
        int current = 1;
        for(int i = 0; i <length;i++){
            left = i-1;
            right = i+1;
            while(left>=0 && s.charAt(left) == s.charAt(i)){
                current++;
                left--;
            }
            while(right<length&& s.charAt(right) == s.charAt(i)){
                current++;
                right++;
            }
            while(left>=0 && right<length && s.charAt(left) == s.charAt(right)){
                current = current +2;
                left--;
                right++;
            }
            if(current>maxLength){
                maxLength = current;
                start = left;
            }
            current = 1;
        }
        return s.substring(start+1, start+maxLength+1);
    }
}
// @lc code=end

