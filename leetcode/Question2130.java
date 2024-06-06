package leetcode;

// Maximum Twin Sum of a Linked List
import java.util.Stack;

public class Question2130 {
    private static int pairSum(ListNode head) {
        if (head.next.next == null) {
            return head.val + head.next.val;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        int max = 0;
        while (slow != null) {
            max = Math.max(max, stack.pop() + slow.val);
            slow = slow.next;
        }
        return max;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        // head.print();
        System.out.println(pairSum(head));
    }
}
