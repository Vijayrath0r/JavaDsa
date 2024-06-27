package leetcode;

// Merge k Sorted Lists
import java.util.PriorityQueue;
import java.util.Queue;

public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        Queue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }

        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Question23 solution = new Question23();
        int[][] arrayLists = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        ListNode[] lists = new ListNode[arrayLists.length];
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = ListNode.makeList(arrayLists[i]);
            // temp.print();
            lists[i] = temp;
        }

        ListNode result = solution.mergeKLists(lists);
        result.print();
    }
}
