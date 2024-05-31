package leetcode;

// Palindrome Linked List
import java.util.Stack;

public class Questoin234 {
    private static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the length of the list is odd, move slow pointer one step forward
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (stack.isEmpty() || stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.print();

        System.out.println(isPalindrome(head));
    }
}
