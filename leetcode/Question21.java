package leetcode;

//  Merge Two Sorted Lists
public class Question21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (list1 != null || list2 != null) {
            if (list1 != null && (list2 == null || list1.val < list2.val)) {
                tail.next = list1;
                list1 = list1.next;
            } else if (list2 != null) {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        head = head.next;
        return head;
    }
}
