import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    Stack<TreeNode> stack = new Stack<>();
    public int kthSmallest(TreeNode root, int k) {
        travel(root);
        while(stack.size()>k){
            stack.pop();
        }
        return stack.pop().val;
    }

    private void travel(TreeNode root){
        if(root == null){
            return ;
        }
        travel(root.left);
        stack.push(root);
        travel(root.right);
    }
}
// @lc code=end

