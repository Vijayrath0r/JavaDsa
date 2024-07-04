package leetcode;

// Merge Nodes in Between Zeros
public class Question2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head;
        int sum = current.val;
        ListNode temp = current;
        while (temp != null) {
            sum += temp.val;
            if (temp.val == 0) {
                current.val = sum;
                sum = 0;
                current = current.next = temp.next;
            }
            temp = temp.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Question2181 solution = new Question2181();
        int[] list = { 0, 3, 1, 0, 4, 5, 2, 0 };

        ListNode head = ListNode.makeList(list);

        ListNode result = solution.mergeNodes(head);
        result.print();
    }
}
