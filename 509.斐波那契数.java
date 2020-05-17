/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        int[] arrays = new int[N+1];
        arrays[0] = 0;
        arrays[1] = 1;
        for(int i = 2;i <=N;i++){
            arrays[i] = arrays[i-1]+arrays[i-2];
        }
        return arrays[N];
    }

}
// @lc code=end

