import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        LinkedList<String> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int number = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                if(sb.length() != 0){
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
                number = number * 10 + (s.charAt(i)-'0');
            }
            if(s.charAt(i) == '['){
                list.add(String.valueOf(number));
                number=0;
                list.add("[");
            }
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i) == ']'){
                while(!"[".equals(list.get(list.size()-1))){
                    sb.insert(0,list.removeLast());
                }
                list.removeLast();
                int count = Integer.parseInt(list.removeLast());
                list.add(String.valueOf(sb).repeat(Math.max(0, count)));
                sb = new StringBuilder();
            }
        }
        if(sb.length()!=0){
            list.add(sb.toString());
            sb = new StringBuilder();
        }
        for (String value : list) {
            sb.append(value);
        }
        return sb.toString();
    }
}
// @lc code=end

