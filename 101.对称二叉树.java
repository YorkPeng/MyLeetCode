/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if(root== null||(root.left == null && root.right == null)){
            return true;
        }else{
            return isMirror(root.left, root.right);
        }
    }

    public boolean isMirror(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if((p==null && q !=null) || (p != null&&q==null)||p.val != q.val){
            return false;
        }
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
// @lc code=end

