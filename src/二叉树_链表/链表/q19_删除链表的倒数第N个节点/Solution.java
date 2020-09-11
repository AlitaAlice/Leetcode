package 二叉树_链表.链表.q19_删除链表的倒数第N个节点;

import java.util.List;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 10:21 2020/9/6
 */
class Solution {

    /**滑动窗口的思想
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        /**
         * 节点赋值
         * 导致的结果first 和second都可以操控dummy
         */
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <=n ; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
