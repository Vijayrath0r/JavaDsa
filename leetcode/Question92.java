package leetcode;

public class Question92 {
    private static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current = head;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.print();

        ListNode result = reverseBetween(head, 2, 4);
        result.print();
    }
}
