/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int half = 1 + (n-1)/2;
        int low = 1;
        int big = n;
        int result = 0;
        while(low <= big){
            result = guess(half);
            if(result == -1){
                big = half-1;
                half = low + (big - low)/2;
            }else if(result == 1){
                low = half +1;
                half = low +(big-low)/2;
            }else{
                return half;
            }
        }
        return 1;
    }
}
// @lc code=end

