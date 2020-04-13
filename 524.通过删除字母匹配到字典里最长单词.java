/*
 * @lc app=leetcode.cn id=524 lang=java
 *
 * [524] 通过删除字母匹配到字典里最长单词
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for(String a : d ){
            int l1 = a.length();
            int l2 = longestWord.length();
            if(l1<l2 || (l1==l2 && longestWord.compareTo(a) < 0)){
                continue;
            }
            if(findStr(s, a)){
                longestWord = a;
            }
        }
        return longestWord;
    }

    private boolean findStr(String s1, String s2){
        int i = 0;
        int j = 0;
        for(;i<s1.length()&&j<s2.length();){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        return j == s2.length();
    }
}
// @lc code=end

