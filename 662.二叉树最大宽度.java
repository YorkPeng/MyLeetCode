import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
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
    public int widthOfBinaryTree(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return 0;
        }
        queue.add(root);
        list.add(1);
        int result = 1;
        while(!queue.isEmpty()){
            int count = queue.size();
            for(int i = 0 ; i < count;i++){
                TreeNode temp = queue.poll();
                int currentLevel = list.removeFirst();
                if(temp.left != null){
                    queue.add(temp.left);
                    list.add(currentLevel*2);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                    list.add(currentLevel*2+1);
                }
            }
            if(list.size()>=2){
            result = Math.max(result, list.getLast() - list.getFirst() +1);
            }

        }
        return result;
    }
}
// @lc code=end

