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
        Stack<String> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        char[] c = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        StringBuilder number = new StringBuilder();
        for(int i = 0; i < c.length;i++){
            if(c[i]>='0' && c[i] <= '9'){
                number.append(String.valueOf(c[i]));
            }else if (c[i] == '['){
                list.add(Integer.valueOf(number.toString()));
                number = new StringBuilder();
                stack.push(String.valueOf(c[i]));
            }else if ((c[i] >='a' && c[i] <='z') || (c[i] >= 'A' && c[i]<='Z')){
                stack.push(String.valueOf(c[i]));
            }else if(c[i] == ']'){
                temp = new StringBuilder();
                ArrayList<String> holder = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                while(!"[".equals(stack.peek())){
                    holder.add(stack.pop());
                }
                stack.pop();
                for(int j = holder.size()-1;j>=0;j--){
                    sb.append(holder.get(j));
                }
                int times = list.remove(list.size()-1);
                for(int j = 0; j < times; j++){
                    temp.append(sb);
                }
                stack.push(temp.toString());
                temp = new StringBuilder();
            }
        }
        temp = new StringBuilder();
        ArrayList<String> holder2 = new ArrayList<>();
        while(!stack.isEmpty()){
            holder2.add(stack.pop());
        }
        for(int j = holder2.size()-1;j>=0;j--){
            temp.append(holder2.get(j));
        }
        return temp.toString();
    }
}
// @lc code=end

