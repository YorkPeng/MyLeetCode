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
        if(l1==null){
            return l2;
        }
        if( l2 == null){
            return l1;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int plus = 0;
        while(head1 != null && head2 != null){
            int count = head1.val + head2.val;
            if(plus == 1){
                count += plus;
            }
            plus = count/10;
            count %=10;
            ListNode temp = new ListNode(count);
            head.next = temp;
            head = head.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 != null){
            while(head1 != null){
                int count = head1.val;
                if(plus == 1){
                    count += plus;
                }
                plus = count/10;
                count %=10;
                ListNode temp = new ListNode(count);
                head.next = temp;
                head = head.next;
                head1 = head1.next;
            }
        }
        if(head2 != null){
            while(head2 != null){
                int count = head2.val;
                if(plus == 1){
                    count += plus;
                }
                plus = count/10;
                count %=10;
                ListNode temp = new ListNode(count);
                head.next = temp;
                head = head.next;
                head2 = head2.next;
            }
        }
        if(head1 == null && head2==null && plus == 1){
            ListNode temp = new ListNode(plus);
                head.next = temp;
                head = head.next;
        }
        return dummyHead.next;
    }
}

