import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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

/**
 *     List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        traversal(root);
        return list;
    }

    private void traversal(TreeNode root){
        if( root == null){
            return;
        }
        list.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }

    68/68 cases passed (1 ms)
Your runtime beats 60.1 % of java submissions
Your memory usage beats 5.3 % of java submissions (37.4 MB)
 */
class Solution {
    List<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        list = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        list.add(cur.val);
        stack.push(cur);
        cur = cur.left;
        while(cur != null ||!stack.isEmpty()){
            if(cur != null){
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                cur = cur.right;
            }
        }
        return list;
    }
}
// @lc code=end

