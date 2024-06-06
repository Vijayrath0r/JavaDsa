package leetcode;

// Delete the Middle Node of a Linked List
public class Question2095 {
    private static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(3);
        // head.next.next = new ListNode(4);
        // head.next.next.next = new ListNode(7);
        // head.next.next.next.next = new ListNode(1);
        // head.next.next.next.next.next = new ListNode(2);
        // head.next.next.next.next.next.next = new ListNode(6);
        // head.print();

        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);

        ListNode head = new ListNode(2);
        // head.next = new ListNode(1);

        ListNode result = deleteMiddle(head);
        result.print();
    }
}

// 1,3,4,7,1,2,6
