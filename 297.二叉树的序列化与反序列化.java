import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;


/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = dfs(root, sb);
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        List<String> list = new LinkedList<String>(Arrays.asList(str));
        return dfs2(list);
    }

    private StringBuilder dfs(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("#,");
            return sb;
        }
        sb.append(root.val);
        sb.append(",");
        sb = dfs(root.left, sb);
        sb = dfs(root.right, sb);
        return sb;
    }

    private TreeNode dfs2(List<String> data){
        if(data.isEmpty()){
            return null;
        }
        if("#".equals(data.get(0))){
            data.remove(0);
            return null;
        }
        TreeNode temp = new TreeNode(Integer.parseInt(data.remove(0)));
        temp.left = dfs2(data);
        temp.right = dfs2(data);
        return temp;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
// @lc code=end

