import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
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
    List<List<Integer>> list;
    Queue<TreeNode> queue;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list = new ArrayList<>();
        if(root == null){
            return list;
        }
        queue = new LinkedList<>();
        TreeNode cur = root;
        queue.add(cur);
        while(!queue.isEmpty()){
            list.add(travel());
        }
        return list;
    }

    public List<Integer> travel(){
        List<Integer> newList = new ArrayList<>();
        int count = queue.size();
        while(count>0){
            TreeNode temp = queue.poll();
            newList.add(temp.val);
            if(temp.left != null){
                    queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
            count--;

        }
        return newList;
    }
}
// @lc code=end

