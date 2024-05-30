package linked_list;

public class RemoveNthNodeFromEnd {
    private static ListNode removeNthFromEnd(ListNode head, int n) {
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(head, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
