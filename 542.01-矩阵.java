import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return null;
        }
        int[][] direction = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
        Queue<Integer[]>queue = new LinkedList<>();
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visit = new boolean[m][n];
        int[][] res = new int[m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 0){
                    queue.add(new Integer[]{i,j});
                    visit[i][j] = true;
                    res[i][j] =0;
                }
            }
        }

        while(!queue.isEmpty()){
            Integer[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i = 0; i < direction.length;i++){
                int newX = x + direction[i][0];
                int newY = y+ direction[i][1];
                if(newX>=0 && newY>=0 && newX < matrix.length && newY< matrix[0].length && !visit[newX][newY]){
                    visit[newX][newY] = true;
                    res[newX][newY] = res[x][y] + 1;
                    queue.add(new Integer[]{newX,newY});
                }
            }
        }
        return res;
    }
}
// @lc code=end

