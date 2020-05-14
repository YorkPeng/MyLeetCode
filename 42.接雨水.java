/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        LinkedList<Integer> stack = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[i] > height[stack.getLast()]){
                int index = stack.removeLast();
                if(stack.isEmpty()){
                    break;
                }
                int left = stack.getLast();
                int width = i - left - 1;
                int max = Math.min(height[i],height[stack.getLast()]);
                count += width * (max-height[index]);
            }
            stack.addLast(i);
        }
        return count;
    }
}
// @lc code=end

