package leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode current = this; // Start with the current instance
        System.out.println("************************************************************************");
        System.out.println("| head");
        System.out.println("V");
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("************************************************************************");
    }

    public void print(ListNode point) {
        if (point == null || point.next == null) {
            this.print();
            return;
        }
        ListNode current = this; // Start with the current instance
        System.out.println("************************************************************************");
        System.out.println("| head");
        System.out.println("V");
        while (current != null) {
            if (current.next == point.next) {
                System.out.print(current.val + "(current) -> ");
            } else {
                System.out.print(current.val + " -> ");
            }
            current = current.next;
        }
        System.out.println("null");
        System.out.println("************************************************************************");
    }

    public static ListNode makeList(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        ListNode head = new ListNode(list[0]);
        ListNode current = head;

        for (int i = 1; i < list.length; i++) {
            current.next = new ListNode(list[i]);
            current = current.next;
        }

        return head;
    }
}
