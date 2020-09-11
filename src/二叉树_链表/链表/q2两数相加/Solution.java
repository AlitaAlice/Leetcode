package 二叉树_链表.链表.q2两数相加;

import java.util.List;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 21:31 2020/9/5
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         * rs 俩链表之和的第一个节点的val
         */
        ListNode rs = new ListNode(l1.val + l2.val);
        /**
         * l1和l2的第2个节点
         */
        l1 = l1.next;
        l2 = l2.next;
        /**
         * 第一次遍历
         */
            /**
             * 第2个节点
             */
        /**
         * 将rs赋值给temp
          */
        ListNode temp=rs;
        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if(l2!=null)
            {
                b = l2.val;
            }
            int t = a + b;
            temp.next = new ListNode(t);
            temp = temp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            }
        temp = rs;
        while (temp != null) {
            if (temp.val >= 10) {
                temp.val = temp.val - 10;
                if (temp.next == null) {
                    temp.next = new ListNode(0);
                }
                temp.next.val = temp.next.val + 1;
            }
            temp = temp.next;
        }
        return rs;
        }

}
