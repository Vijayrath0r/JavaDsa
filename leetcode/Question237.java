package leetcode;

// Delete Node in a Linked List
public class Question237 {
    private static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        int[] list = { 4, 5, 1, 9 };

        ListNode head = ListNode.makeList(list);
        head.print();

        deleteNode(head.next);

        head.print();
    }
}
