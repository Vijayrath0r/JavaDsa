package linked_list;

//  Add Two Numbers
public class AddTwoNumbers {
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

// Input: l1 = [9,9,9,9,9,9,9],
// l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]