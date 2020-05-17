/*
 * @lc app=leetcode.cn id=124 lang=java
 *
 * [124] 二叉树中的最大路径和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int realMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       getMax(root);
       return realMax;
    }
    private int getMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,getMax(root.left));
        int right = Math.max(0,getMax(root.right));
        realMax = Math.max(realMax, root.val+left+right);
        return Math.max(left, right) + root.val;
    }
}
// @lc code=end

