package leetcode;

// Reverse Linked List II
public class Question92 {
    private static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode leftNode = dummy;
        ListNode rightNode = null;
        int counter = 1;
        while (current != null) {
            if (counter == left - 1) {
                leftNode = current;
            }
            if (counter == right) {
                rightNode = current.next;
                current.next = null;
            }
            counter++;
            current = current.next;
        }
        if (leftNode != null && leftNode.next != null) {
            leftNode.next = reverse(leftNode.next);
            while (leftNode.next != null) {
                leftNode = leftNode.next;
            }
            leftNode.next = rightNode;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        // int[] list = { 5 };
        // int[] list = { 1, 2 };

        ListNode head = ListNode.makeList(list);
        // head.print();

        ListNode result = reverseBetween(head, 2, 4);
        result.print();
    }
}
