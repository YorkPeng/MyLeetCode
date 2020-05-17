/*
 * @lc app=leetcode.cn id=1143 lang=java
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0){
            return 0;
        }
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();
        int n = str1.length;
        int m = str2.length;
        int[][] dp = new int[n][m];
        dp[0][0] = str1[0] == str2[0]?1:0;
        for(int i = 1;i<n;i++){
            dp[i][0] = str1[i] == str2[0]?1:dp[i-1][0];
        }
        for(int i = 1;i<m;i++){
            dp[0][i] = str1[0] == str2[i]?1:dp[0][i-1];
        }
        for(int i = 1; i < n;i++){
            for(int j = 1;j<m;j++){
                if(str1[i] == str2[j]){
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+1);
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}
// @lc code=end

