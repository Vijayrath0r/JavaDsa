package leetcode;

// Find the Minimum and Maximum Number of Nodes Between Critical Points
import java.util.Arrays;

public class Question2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head.next.next == null) {
            return new int[] { -1, -1 };
        }

        int firstPoint = -1, lastPoint = -1, idx = 1, minDiff = Integer.MAX_VALUE;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode next = current.next;

        while (next != null) {
            if ((prev.val < current.val && current.val > next.val) ||
                    (prev.val > current.val && current.val < next.val)) {
                if (firstPoint == -1) {
                    firstPoint = idx;
                    lastPoint = idx;
                } else {
                    minDiff = Math.min(minDiff, idx - lastPoint);
                    lastPoint = idx;
                }
            }
            prev = current;
            current = next;
            next = next.next;
            idx++;
        }

        if (firstPoint == lastPoint) {
            return new int[] { -1, -1 };
        }

        return new int[] { minDiff, lastPoint - firstPoint };
    }

    public static void main(String[] args) {
        Question2058 solution = new Question2058();
        // int[] list = { 3, 1 };
        int[] list = { 5, 3, 1, 2, 5, 1, 2 };
        // int[] list = { 2, 3, 3, 2 };
        // int[] list = { 2, 2, 1, 3 };
        ListNode head = ListNode.makeList(list);
        head.print();

        int[] result = solution.nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(result));
    }
}
