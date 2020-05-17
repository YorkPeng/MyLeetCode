/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
//        int max = Integer.MIN_VALUE;
//        for(int i = 0;i<height.length;i++){
//            for(int j = i+1; j < height.length;j++){
//                int currentMax = Math.min(height[i],height[j]) * (j-i);
//                max = Math.max(max,currentMax);
//            }
//        }
//        return max;
        int i = 0;
        int j = height.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            int currentMax = Math.min(height[i],height[j]) * (j-i);
            max = Math.max(max,currentMax);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
// @lc code=end

