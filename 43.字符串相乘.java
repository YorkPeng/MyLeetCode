/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0){
            return "";
        }
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        int totalLength = str1.length + str2.length;
        int bigger = Math.max(str1.length, str2.length);
        int[][] temp = new int[bigger][totalLength];
        int count = 0;
        int layer = 0;
        int i = str1.length - 1;
        int j = str2.length - 1;
        for (; i >= 0; i--) {
            int k = 0;
            for (j = str2.length - 1; j >= 0; j--) {
                int realNum = (str2[j] - '0') * (str1[i] - '0');
                temp[bigger - i - 1][totalLength - layer - 1 - k] = realNum % 10 + count;
                count = realNum / 10;
                k++;
            }
            temp[bigger - i - 1][totalLength - layer - 1 - k] = count;
            count = 0;
            layer++;
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (j = totalLength - 1; j >= 0; j--) {
            for (i = 0; i < bigger; i++) {
                sum += temp[i][j];
            }
            sum += count;
            count = sum / 10;
            while (sum >= 10) {
                sum %= 10;
            }
            sb.append(sum);
            sum = 0;
        }
        if (count != 0) {
            sb.append(count);
        }
        return sb.reverse().toString().replaceFirst("^0*","");
    }
}
// @lc code=end

