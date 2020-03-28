/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);
        int temp = -1;
        while(i <= j){
            temp = i*i + j*j;
            if(temp < c){
                i++;
            }else if (temp > c){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

