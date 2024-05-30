package leetcode;

/**
 * Question19 - Remove Nth Node From End of List
 */
public class Question19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (n-- > 0)
            p2 = p2.next;
        if (p2 == null) {
            return head.next;
        }
        while (p2.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
        return head;
    }
}