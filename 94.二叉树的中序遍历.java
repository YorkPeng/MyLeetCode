import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
 * 
 * 
 * 递归算法如下
 *     List<Integer> list;
 *
 *   public List<Integer> inorderTraversal(TreeNode root) {
 *        list = new ArrayList<>();
 *          traversal(root);
 *        return list;
 *    }
 *
 *    public void traversal(TreeNode root){
 *        if(root == null){
 *            return;
 *        }
 *        traversal(root.left);
 *        list.add(root.val);
 *        traversal(root.right);
 *    }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }

}
// @lc code=end

