package leetcode;

// Remove Linked List Elements
public class Question203 {
    private static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                head = current = current.next;
            } else if (current.next != null && current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);
        // head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);
        // head.next.next.next.next.next.next = new ListNode(7);
        // head.print();

        int val = 7;

        ListNode result = removeElements(head, val);
        result.print();
    }
}
