import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] T) {
        if(T == null ){
            return null;
        }
        if(T.length == 0){
            return new int[1];
        }
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[T.length];
        for(int i = 0;i < T.length;i++){
            while(!stack.isEmpty() && T[i] > T[stack.peek()]){
                int pos = stack.pop();
                result[pos] = i-pos;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            result[stack.pop()] = 0;
        }
        return result;
    }
}
// @lc code=end

