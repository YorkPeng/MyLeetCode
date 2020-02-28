/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
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
        boolean plus = false;
        ListNode head = new ListNode();
        while(l1.next != null && l2.next != null){
            int num = l1.val + l2.val;
            if(num >= 10){
              ListNode list = new ListNode(num%10);
              plus = true;
            }
            head.next = list;
            l1 = l1.next;
            l2 = l2.next;
        }
    }
}

