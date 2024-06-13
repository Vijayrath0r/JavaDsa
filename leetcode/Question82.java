package leetcode;

// Remove Duplicates from Sorted List II
public class Question82 {
    private static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                int value = current.val;

                while (current != null && current.val == value) {
                    current = current.next;
                }
                if (prev == null) {
                    head = current;
                } else {
                    prev.next = current;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(3);
        // head.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next.next = new ListNode(5);
        // head.print();

        // ListNode head = new ListNode(1);
        // head.next = new ListNode(1);
        // head.next.next = new ListNode(1);
        // head.next.next.next = new ListNode(2);
        // head.next.next.next.next = new ListNode(3);
        // head.print();

        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(3);
        // head.next.next.next = new ListNode(4);
        // head.next.next.next.next = new ListNode(4);
        // head.print();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.print();

        ListNode result = deleteDuplicates(head);
        result.print();
    }
}