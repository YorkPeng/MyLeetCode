import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        rightView(root,list,queue);
        return list;
    }

    public void rightView(TreeNode root, ArrayList<Integer> list, Queue<TreeNode> queue){
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode temp = null;
            for(int i = 0; i < size;i++){
                temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            list.add(temp.val);
        }
    }
}
// @lc code=end

