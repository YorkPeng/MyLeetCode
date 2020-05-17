import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int i = 0;
        int j = 0;
        for(;j< s.length();j++){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j)) >= i){
                    i = map.get(s.charAt(j));
                    i++;
                }
            }
            map.put(s.charAt(j),j);
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
// @lc code=end

