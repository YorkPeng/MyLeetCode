/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = null;
        ListNode head1 = headA;
        ListNode head2 = headB;
        int countA = 0;
        int countB= 0;
        while(head1 != null){
            countA++;
            head1 = head1.next;
        }
        while(head2 != null){
            countB++;
            head2 = head2.next;
        }

        head1 = headA;
        head2= headB;
        if(countA > countB){
            while(countA>countB){
              head1 = head1.next;
              countA--;
            }
        }else if(countB > countA){
            while(countB > countA){
                head2 = head2.next;
                countB--;
            }
        }

        while(head1!=null && head2!=null){
            if(head1 == head2){
                temp = head1;
                break;
            }
            head1 =head1.next;
            head2 = head2.next;
        }

        return temp;
    }
}
// @lc code=end

