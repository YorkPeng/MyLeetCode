/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sum = count;
            if(i >= 0){
                sum += (a.charAt(i--) - '0');
            }
            if(j >= 0){
                sum += (b.charAt(j--) - '0');
            }
            stringBuilder.append(sum % 2);
            count = sum / 2;
        }
        while(count != 0){
            stringBuilder.append(count % 2);
            count /= 2;
        }

        return stringBuilder.reverse().toString();

    }
}

