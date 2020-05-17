/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
            return null;
        }
        ListNode first = head;
        ListNode last = head.next;

        while(first.next != null || last != null){
            if(first.val != last.val){
                first.next = last;
                first = last;
            }else if(last.next == null){
                first.next = null;
            }
            last = last.next;
        }

        return head;
    }
}
// @lc code=end

