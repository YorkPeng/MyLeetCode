/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = head;
        ListNode slow = dummy;
        boolean flag = false;
        while(fast != null && fast.next !=  null){
            if(fast.val == fast.next.val){
                fast = fast.next;
                flag = true;
                continue;
            }
            if(flag){
                slow.next = fast.next;
                fast = fast.next;
                flag = false;
            }else{
                slow = fast;
                fast = fast.next;
            }
        }
        if(flag){
            slow.next = fast.next;
        }
        return dummy.next;
    }
}
// @lc code=end

