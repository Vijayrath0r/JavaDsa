package linked_list;

public class MergeTwoLists {
    private static CustomLinkedList mergeTwoLists(CustomLinkedList list1, CustomLinkedList list2) {
        ListNode list1head = list1.getHead();
        ListNode list2head = list2.getHead();

        CustomLinkedList result = new CustomLinkedList();
        while (list1head != null || list2head != null) {
            if (list1head != null && (list2head == null || list1head.val < list2head.val)) {
                result.add(list1head.val);
                list1head = list1head.next;
            } else if (list2head != null) {
                result.add(list2head.val);
                list2head = list2head.next;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList list2 = new CustomLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        // list1.printList();

        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(6);
        // list2.printList();

        System.out.println("----------------------");
        CustomLinkedList result = mergeTwoLists(list1, list2);
        System.out.println("----------------------");
        result.printList();
    }
}
