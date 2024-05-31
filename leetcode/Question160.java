package leetcode;

// Intersection of Two Linked Lists
public class Question160 {
    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

        int lenA = 0;
        int lenB = 0;

        while (currentA != null) {
            currentA = currentA.next;
            lenA++;
        }
        while (currentB != null) {
            currentB = currentB.next;
            lenB++;
        }

        currentA = headA;
        currentB = headB;

        while (lenA != lenB) {
            if (lenA > lenB) {
                currentA = currentA.next;
                lenA--;
            } else {
                currentB = currentB.next;
                lenB--;
            }
        }

        while (currentA != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = new ListNode(8);
        listA.next.next.next = new ListNode(9);
        listA.next.next.next.next = new ListNode(10);
        listA.print();

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(6);
        listB.next.next = new ListNode(1);
        listB.next.next.next = listA.next.next;
        listB.print();

        ListNode result = getIntersectionNode(listA, listB);
        result.print();
    }
}
/*
 * Input: intersectVal = 8,
 * listA = [4,1,8,4,5],
 * listB = [5,6,1,8,4,5],
 * skipA = 2,
 * skipB = 3
 * Output: Intersected at '8'
 */