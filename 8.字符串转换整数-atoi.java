/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        if( str == null){
            return 0;
        }
        boolean first = true;
        int negative = 1;
        long result = 0;
        for(int i = 0;i < str.length();i++){
            if(first && str.charAt(i) == ' '){
                continue;
            }else if(first && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                break;
            }else if(!first && (str.charAt(i) == ' ' || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))){
                break;
            }else if(first && str.charAt(i)=='-'){
                negative = negative * -1;
                first = false;
            }else if(first && str.charAt(i)=='+'){
                first = false;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                first = false;
                if((result * 10 + (str.charAt(i) - '0')) > Integer.MAX_VALUE && negative ==1){
                    result = Integer.MAX_VALUE;
                    return Integer.parseInt(String.valueOf(result));
                }
                if((result * 10 + (str.charAt(i) - '0')) > Integer.MAX_VALUE && negative == -1){
                    result = Integer.MIN_VALUE;
                    return Integer.parseInt(String.valueOf(result));
                }
                result = result * 10 + (str.charAt(i) - '0');
            }else{
                break;
            }
        }
        if(result != 0){
            result *= negative;
        }
        return Integer.parseInt(String.valueOf(result));
    }
}
// @lc code=end

