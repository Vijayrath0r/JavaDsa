package leetcode;

public class Question92 {
    private static ListNode reverseBetween(ListNode head, int left, int right) {
        return head;
    }

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };


        ListNode head = ListNode.makeList(list);
        head.print();

        ListNode result = reverseBetween(head, 2, 4);
        result.print();
    }
}
