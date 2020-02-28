/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */
class Solution {
    public int mySqrt(int x) {
         long i = 0;
         long j = x / 2 + 1;
        while (i <= j)
        {
             long mid = (i + j) / 2;
             long sq = mid * mid;
            if (sq == x) return (int)mid;
            else if (sq < x) i = mid + 1;
            else j = mid - 1;
        }
        return (int)j;
    }
}

