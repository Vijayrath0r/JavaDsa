package leetcode;

public class Question2807 {
    public int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode newNode = new ListNode(calculateGCD(current.val, current.next.val));
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Question2807 solution = new Question2807();
        int[] list = { 18, 6, 10, 3 };
        ListNode head = ListNode.makeList(list);
        head.print();

        ListNode result = solution.insertGreatestCommonDivisors(head);
        result.print();
    }
}
