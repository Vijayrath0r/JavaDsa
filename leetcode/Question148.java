package leetcode;

// Sort List
public class Question148 {
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    private static ListNode getCenter(ListNode head) {
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
        }
        return head;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode center = getCenter(head);
        ListNode right = center.next;
        center.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] list = { 4, 2, 1, 3 };
        ListNode head = ListNode.makeList(list);

        ListNode result = sortList(head);
        result.print();
    }
}
