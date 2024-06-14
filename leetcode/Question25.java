package leetcode;

// Reverse Nodes in k-Group
public class Question25 {
    private static ListNode helper(ListNode head, int k) {
        int counter = 0;
        ListNode current = head;

        // Check if there are at least k nodes left in the linked list
        while (counter < k && current != null) {
            current = current.next;
            counter++;
        }

        // If we have less than k nodes, return the head as is
        if (counter < k) {
            return head;
        }

        // Reverse k nodes
        current = head;
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // head is now the end of the reversed group
        // Recursively call helper for the remaining list and connect it
        head.next = helper(current, k);

        return prev; // prev is the new head of the reversed group
    }

    private static ListNode reverseKGroup(ListNode head, int k) {
        return helper(head, k);
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        int k = 3;
        ListNode head = ListNode.makeList(list);

        ListNode result = reverseKGroup(head, k);
        result.print();
    }
}
