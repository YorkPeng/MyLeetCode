import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
 //   List<Integer> list  = new ArrayList<>();
 //   public List<Integer> preorder(Node root) {
 //       if(root == null){
 //           return list;
 //       }
 //       list.add(root.val);
 //       pre(root);
 //       return list;
 //   }
//
 //   public void pre(Node root){
 //       List<Node> thisChildren = root.children;
 //       if(thisChildren == null){
 //           return;
 //       }
 //       for (Node node : thisChildren) {
 //           list.add(node.val);
 //           pre(node);
 //       }
 //   }

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList();
        Stack<Node> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            list.add(temp.val);
            for(int i = temp.children.size()-1;i>=0;i--){
                stack.push(temp.children.get(i));
            }
        }
        return list;
    }
}
// @lc code=end

