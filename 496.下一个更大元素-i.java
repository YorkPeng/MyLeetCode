import java.util.Stack;

/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int k = 0;
        int j = nums2.length-1;
        Stack stack = new Stack<>();
        while(k < nums1.length){
            if(nums2[j] != nums1[k]){
                stack.push(nums2[j]);
                j--;
            }else{
                while(!stack.isEmpty()){
                    if(nums1[k] < (int)stack.peek()){
                        result[k]= (int)stack.peek();
                        break;
                    }else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    result[k] = -1;
                }
                k++;
                j = nums2.length-1;
                stack = new Stack<>();
            }
        }
        return result;
    }
}
// @lc code=end

