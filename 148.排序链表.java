/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode middleHead = findMiddle(head);
        ListNode l1 = mergeSort(head);
        ListNode l2 = mergeSort(middleHead);
        return merge(l1, l2);
        
    }

    private ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }

    private ListNode merge(ListNode head1, ListNode head2){
        ListNode dummyHead = new ListNode(-1);
        ListNode head = dummyHead;
        ListNode l1 = head1;
        ListNode l2 = head2;
        while(l1!=null && l2 != null){
            if(l1.val <l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2=l2.next;
            }
            head = head.next;
        }
        if(l1!=null){
            head.next = l1;
        }
        if(l2!=null){
            head.next = l2;
        }
        return dummyHead.next;
    }
}
// @lc code=end

