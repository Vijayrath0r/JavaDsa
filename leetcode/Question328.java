package leetcode;

// Odd Even Linked List
public class Question328 {
    private static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode current = head;

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            current.next = current.next.next;

            nextNode.next = null;

            tail.next = nextNode;
            tail = tail.next;

            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        current.next = dummy.next;
        return head;
    }

    public static void main(String[] args) {
        // int[] list = { 1, 2, 3, 4, 5 }; // [1,3,5,2,4]
        // int[] list = { 2, 1, 3, 5, 6, 4, 7 }; // [2,3,6,7,1,5,4]
        // int[] list = { 2, 1 };
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8 };
        ListNode head = ListNode.makeList(list);

        ListNode result = oddEvenList(head);
        result.print();
    }
}
