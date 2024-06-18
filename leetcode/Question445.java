package leetcode;

// Add Two Numbers II

public class Question445 {
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

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);

        int carry = (h1.val + h2.val);
        ListNode result = new ListNode(carry % 10);
        carry /= 10;
        h1 = h1.next;
        h2 = h2.next;

        ListNode current = result;
        while (h1 != null || h2 != null) {
            if (h1 != null && h2 != null) {
                carry += (h1.val + h2.val);
                h1 = h1.next;
                h2 = h2.next;
            } else if (h1 != null) {
                carry += h1.val;
                h1 = h1.next;
            } else {
                carry += h2.val;
                h2 = h2.next;
            }
            current.next = new ListNode(carry % 10);
            carry /= 10;
            current = current.next;
        }
        if (carry != 0) {
            current.next = new ListNode(carry % 10);
        }

        return reverse(result);
    }

    public static void main(String[] args) {
        // int[] l1 = { 7, 2, 4, 3 }, l2 = { 5, 6, 4 }; // [ 7, 8, 0, 7]
        int[] l1 = { 9, 9, 9, 9 }, l2 = { 9, 9, 9, 9 }; // [ 1,9,9,9,8]

        ListNode result = addTwoNumbers(ListNode.makeList(l1), ListNode.makeList(l2));
        result.print();
    }
}
