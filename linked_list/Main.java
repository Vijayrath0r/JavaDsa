package linked_list;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Add element at the beginning
        list.addFirst(0);

        // Add element at the end
        list.addLast(4);

        list.printList(); // Output: 0 1 2 3 4

        // Get elements
        System.out.println("First element: " + list.getFirst()); // Output: 0
        System.out.println("Last element: " + list.getLast()); // Output: 4
        System.out.println("Element at index 2: " + list.get(2)); // Output: 2

        // Remove elements
        System.out.println("Removed first element: " + list.removeFirst()); // Output: 0
        System.out.println("Removed last element: " + list.removeLast()); // Output: 4
        System.out.println("Removed element: " + list.remove()); // Output: 1

        // Get size
        System.out.println("Size of the list: " + list.size()); // Output: 2
    }
}
