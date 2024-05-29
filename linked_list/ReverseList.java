package linked_list;

public class ReverseList {
    private static void reverse(CustomLinkedList list, ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // Save the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev and current one step forward
            current = nextTemp;
        }

        // Update the head of the list
        list.setHead(prev);
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: ");
        list.printList();

        reverse(list, list.getHead());

        System.out.println("Reversed list: ");
        list.printList();
    }
}
