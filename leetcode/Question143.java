package leetcode;

// Reorder List
public class Question143 {
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    private static void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        ListNode tail = slow;
        while (fast != null && fast.next != null) {
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            tail = tail.next;
        }
        tail.next = reverse(tail.next);

        ListNode current = head;

        while (current != null && current.next != null) {
            ListNode replacedNode = tail.next;
            ListNode currentNext = current.next;

            tail.next = tail.next.next;

            replacedNode.next = currentNext;
            current.next = replacedNode;

            current = current.next.next;
        }
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        ListNode head = ListNode.makeList(list);

        reorderList(head);
        head.print();
    }
}
