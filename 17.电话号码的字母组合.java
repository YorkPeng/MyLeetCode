import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    HashMap<Integer,String> map;
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return list;
        }
        map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        char[] str = digits.toCharArray();
        StringBuilder sb = new StringBuilder();
        backTracking(list,str,sb,0);
        return list;
    }

    private void backTracking(List<String> list, char[] str, StringBuilder sb, int index){
        if(sb.length() == str.length){
            String temp = new String(sb);
            list.add(temp);
            return;
        }
        char digit = str[index];
        char[] alpha = map.get(digit-'0').toCharArray();
        for (char c : alpha) {
            sb.append(c);
            backTracking(list, str, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
// @lc code=end

