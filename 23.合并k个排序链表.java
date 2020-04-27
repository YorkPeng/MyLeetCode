/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        int length = lists.length;
        ListNode res = MergerSort(lists, 0, length-1);
        return res;
    }

    private ListNode MergerSort(ListNode[] lists, int l, int r){
        if(l >= r){
            return lists[l];
        }
        int mid = l+ (r-l)/2;
        ListNode left = MergerSort(lists, l, mid);
        ListNode right = MergerSort(lists, mid+1, r);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        ListNode h1 = left, h2 = right;
        while(h1 != null && h2!= null){
            if(h1.val<h2.val){
                head.next = h1;
                h1 = h1.next;
            }else{
                head.next = h2;
                h2 = h2.next;
            }
            head = head.next;
        }
        if(h1 == null){
            head.next = h2;
        }else if(h2 == null){
            head.next = h1;
        }
        return dummy.next;
    }
}
// @lc code=end

