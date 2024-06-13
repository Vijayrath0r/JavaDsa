package leetcode;

// Rotate List
public class Question61 {
    private static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int len = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        ListNode rotate = head;
        for (int i = 1; i < len - k; i++) {
            rotate = rotate.next;
        }

        ListNode newHead = rotate.next;
        rotate.next = null;

        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        int k = 9;

        // int[] list = { 0, 1, 2 };
        // int k = 4;

        ListNode head = ListNode.makeList(list);

        ListNode result = rotateRight(head, k);
        result.print();
    }
}
