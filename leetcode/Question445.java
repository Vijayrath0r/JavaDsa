package leetcode;

// Add Two Numbers II
import java.util.Stack;

public class Question445 {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode sum = dummy.next;
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            sum = dummy.next;
            if (!s1.isEmpty() && !s2.isEmpty()) {
                carry += s1.pop() + s2.pop();
            } else if (!s1.isEmpty()) {
                carry += s1.pop();
            } else {
                carry += s2.pop();
            }
            ListNode val = new ListNode(carry % 10);
            carry /= 10;
            val.next = sum;
            dummy.next = val;
        }
        if (carry != 0) {
            sum = dummy.next;
            ListNode val = new ListNode(carry % 10);
            val.next = sum;
            dummy.next = val;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // int[] l1 = { 7, 2, 4, 3 }, l2 = { 5, 6, 4 }; // [ 7, 8, 0, 7]
        int[] l1 = { 9, 9, 9, 9 }, l2 = { 9, 9, 9, 9 }; // [ 7, 8, 0, 7]

        ListNode result = addTwoNumbers(ListNode.makeList(l1), ListNode.makeList(l2));
        result.print();
    }
}
