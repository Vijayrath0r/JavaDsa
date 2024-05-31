package leetcode;

//  Add Two Numbers
public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tail = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                carry += l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                carry += l1.val;
                l1 = l1.next;
            } else {
                carry += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            tail.next = new ListNode(carry % 10);
            tail = tail.next;
            // System.out.println(carry % 10);
            carry /= 10;
        }
        if (carry > 0) {
            // System.out.println(carry);
            tail.next = new ListNode(carry % 10);
        }
        result = result.next;
        return result;
    }
}
