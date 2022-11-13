/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution92 {
    /*
        核心算法和反转整个链表相同
        声明三个辅助指针：pre：当前节点前一个节点；cur：当前节点；next：当前节点后一个节点
        首先遍历单链表使当前节点到left所在位置
    */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null && left==right) {
            return head;
        }
        ListNode pre = null, cur = head;
        int index = 1;
        while (cur!=null && index<left) {
            pre = cur;
            cur = cur.next;
            index++;
        }
        ListNode LPre = null, LCur = cur;
        while (LCur!=null && index<=right) {
            ListNode temp = LCur.next;
            LCur.next = LPre;
            LPre = LCur;
            LCur = temp;
            index++;
        }
        if (pre!=null) {
            pre.next = LPre;
        }
        if (LCur!=null) {
            cur.next = LCur;
        }
        if (left == 1) {
            return LPre;
        }
        return head;


    }
}
class Main{
    public static void main(String[] args) {
        int[] input = {3,5};
        ListNode head = new ListNode();
        head.val = input[0];
        ListNode temp = head;
        for(int i=1;i<input.length;i++){
            ListNode flag = new ListNode();
            flag.val = input[i];
            temp.next = flag;
            temp = temp.next;
        }
        // for (int i = 0; i < input.length; i++) {
        //     System.out.println(head.val);
        //     head = head.next;
        // }
        Solution92 s = new Solution92();
        ListNode res =  s.reverseBetween(head, 1, 2);
        for(int i=0;i<input.length;i++){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
// @lc code=end

