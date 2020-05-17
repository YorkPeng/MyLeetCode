/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
    //    StringBuilder sb1 = new StringBuilder(num1);
    //    sb1 = sb1.reverse();
    //    StringBuilder sb2 = new StringBuilder(num2);
    //    sb2 = sb2.reverse();
    //    int[] num = new int[sb1.length()>sb2.length()?sb1.length()+1:sb2.length()+1];
    //    int i =0;
    //    int maxSum = sb1.length()>sb2.length()?sb2.length():sb1.length();
    //    for(;i<maxSum;i++){
    //        num[i] += (sb1.charAt(i)-'0') + (sb2.charAt(i)-'0');
    //        if(num[i] >=10){
    //            num[i+1] += num[i]/10;
    //            num[i]%=10;
    //        }
    //    }
    //    if(i == sb1.length()){
    //        while(i < sb2.length()){
    //            num[i] += sb2.charAt(i) - '0';
    //            if(num[i] >=10){
    //                num[i+1] += num[i]/10;
    //                num[i]%=10;
    //            }
    //            i++;
    //        }
    //    }else if ( i == sb2.length()){
    //        while(i < sb1.length()){
    //            num[i] += sb1.charAt(i) - '0';
    //            if(num[i] >=10){
    //                num[i+1] += num[i]/10;
    //                num[i]%=10;
    //            }
    //            i++;
    //        }
    //    }
    //    StringBuilder sb = new StringBuilder();
    //    int j = num.length-1;
    //    while(j > 0 && num[j] == 0){
    //        j--;
    //    }
    //    for(;j>=0;j--){
    //        sb.append(num[j]);
    //    }
    //    return sb.toString();

    StringBuilder sb = new StringBuilder();
    int carry = 0, i = num1.length()-1, j = num2.length()-1;
    while(i >= 0 || j >= 0 || carry != 0){
        if(i>=0) carry += num1.charAt(i--)-'0';
        if(j>=0) carry += num2.charAt(j--)-'0';
        sb.append(carry%10);
        carry /= 10;
    }
    return sb.reverse().toString();
    }
}
// @lc code=end

