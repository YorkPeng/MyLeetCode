/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树结点最小距离
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
    TreeNode pre = null;
    int max = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root);
        return max;
    }

    private void dfs(TreeNode root){
        if( root == null){
            return;
        }
        dfs(root.left);
        if(pre != null){
            max = Math.min(Math.abs(root.val-pre.val), max);
        }
        pre = root;
        dfs(root.right);
    }

}
// @lc code=end

