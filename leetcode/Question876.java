package leetcode;

// Middle of the Linked List
public class Question876 {
    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6 };
        ListNode head = ListNode.makeList(list);

        ListNode result = middleNode(head);
        result.print();
    }
}
