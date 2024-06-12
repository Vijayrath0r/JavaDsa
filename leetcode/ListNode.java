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
        if (point == null) {
            this.print();
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
}
