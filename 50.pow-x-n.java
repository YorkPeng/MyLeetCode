/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }
        long temp = n;
        if(n < 0){
            x = 1/x;
            temp *= -1;
        }
        double rest = 1;
        while(temp >= 1){
            if(temp%2 == 1){
                rest *= x;
            }
            x *= x;
            temp /= 2;
        }
        return rest;
    }
}
// @lc code=end

