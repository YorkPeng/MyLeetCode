/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int amount = matrix.length * matrix[0].length;
        int lastMod = 0;
        while(list.size()<amount){
            int i = lastMod;
            int j = lastMod;
            for(i = lastMod;i<matrix[0].length-lastMod;i++){
                if(!list.contains(matrix[lastMod][i])){
                    list.add(matrix[lastMod][i]);
                }else {
                    break;
                }
            }
            i--;
            for (j = lastMod+1;j<matrix.length-lastMod;j++){
                if(!list.contains(matrix[j][i])){
                    list.add(matrix[j][i]);
                }else {
                    break;
                }

            }
            j--;
            for (i = matrix[0].length-lastMod-2;i>=0;i--){
                if(!list.contains(matrix[j][i])){
                    list.add(matrix[j][i]);
                }else {
                    break;
                }
            }
            i++;
            for (j = matrix.length-lastMod-2;j>=0;j--){
                if(!list.contains(matrix[j][i])){
                    list.add(matrix[j][i]);
                }else {
                    break;
                }
            }
            lastMod = j+1;
        }
        return list;
    }
}
// @lc code=end

