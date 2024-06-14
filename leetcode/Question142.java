package leetcode;

//  Linked List Cycle II
public class Question142 {
    private static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        // First step: Determine if there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If fast pointer reached null, then there is no cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Second step: Find the entry point of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Both pointers are now at the start of the cycle
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        ListNode result = detectCycle(head);
        System.out.println(result.val);
    }
}
