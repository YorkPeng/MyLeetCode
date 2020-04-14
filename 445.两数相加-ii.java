import java.util.Stack;

/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode head1 = l1;
        ListNode head2 = l2;
        while(head1 != null){
            stack1.push(head1);
            head1 = head1.next;
        }
        while(head2 != null){
            stack2.push(head2);
            head2 = head2.next;
        }
        ListNode currentHead = new ListNode(-1);
        int flag = 0;
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            int count = stack1.pop().val + stack2.pop().val;
            if(flag == 1){
                count++;
            }
            flag = count /10;
            count = count % 10;
            ListNode temp = new ListNode(count);
            temp.next = currentHead.next;
            currentHead.next = temp;
        }
        while(!stack1.isEmpty()){
            int count = stack1.pop().val;
            if(flag == 1){
                count++;
            }
            flag = count /10;
            count = count % 10;
            ListNode temp = new ListNode(count);
            temp.next = currentHead.next;
            currentHead.next = temp;
        }
        while(!stack2.isEmpty()){
            int count = stack2.pop().val;
            if(flag == 1){
                count++;
            }
            flag = count /10;
            count = count % 10;
            ListNode temp = new ListNode(count);
            temp.next = currentHead.next;
            currentHead.next = temp;
        }
        if(flag == 1){
            ListNode temp = new ListNode(flag);
            temp.next = currentHead.next;
            currentHead.next = temp;
        }

        return currentHead.next;
    }
}
// @lc code=end

