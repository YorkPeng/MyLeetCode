/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length -1;
        int j = 0;
        while(i>=0 && j <=matrix[i].length-1){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] <target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
// @lc code=end

