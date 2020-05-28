package 链表相关.q19_删除链表的倒数第N个节点;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 22:23 2020/5/28
 */
class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val=x;
    }
}
public class Solution {
    public ListNode removeNthFromEnd(ListNode head,int n)
    {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode first =dummy;
        ListNode second=dummy;
        for (int i = 1; i <=n + 1; i++) {
            first = first.next;
        }
        while (first!=null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
