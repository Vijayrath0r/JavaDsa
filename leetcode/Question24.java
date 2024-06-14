package leetcode;

// Swap Nodes in Pairs
public class Question24 {
    private static ListNode helper(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;
        ListNode current = head;
        while (current != null && count < 2) {
            current = current.next;
            count++;
        }

        ListNode nextPart = current.next;
        current.next = null;

        ListNode newHead = head.next;
        head.next = helper(nextPart);
        newHead.next = head;

        return newHead;
    }

    private static ListNode swapPairs(ListNode head) {
        return helper(head);
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        ListNode head = ListNode.makeList(list);
        // head.print();

        ListNode result = swapPairs(head);
        result.print();
    }
}
