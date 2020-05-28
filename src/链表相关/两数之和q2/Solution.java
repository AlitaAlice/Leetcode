package 链表相关.两数之和q2;

/**
 * This program demonstrates
 *
 * @author Alita Alice
 * @version 1.0
 * @Date: Created in 21:28 2020/5/28
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
    public ListNode addTwoNumbers(ListNode l1,ListNode l2)
    {
        ListNode rs = new ListNode(l1.val + l2.val);
        l1=l1.next;
        l2=l2.next;
        ListNode temp = rs;
        while(l1!=null || l2!=null)
        {
            int a=0;
            int b=0;
            if(l1!=null)
            {
                a=l1.val;
            }
            if(l2!=null)
            {
                b = l2.val;
            }
            temp.next = new ListNode(a + b);
            temp=temp.next;
            if(l1!=null)
            {
                l1 = l1.next;
            }
            if(l2!=null)
            {
                l2 = l2.next;
            }

        }
        temp = rs;
        while (temp!=null) {
            if (temp.val >= 10) {
                temp.val -= 10;
                if (temp.next == null) {
                    temp.next = new ListNode(0);
                }
                temp.next.val += 1;
            }
                temp = temp.next;
            }

    return rs;
    }
}

