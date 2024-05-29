package linked_list;

public class CustomLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add element at the end
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add element at the beginning
    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add element at the end (same as add)
    public void addLast(int val) {
        add(val);
    }

    // Remove and return the head element
    public int remove() {
        return removeFirst();
    }

    // Remove and return the first element
    public int removeFirst() {
        if (head == null)
            throw new IllegalStateException("List is empty");
        int val = head.val;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return val;
    }

    // Remove and return the last element
    public int removeLast() {
        if (head == null)
            throw new IllegalStateException("List is empty");
        if (head == tail) {
            int val = head.val;
            head = tail = null;
            size--;
            return val;
        }
        ListNode current = head;
        while (current.next != tail) {
            current = current.next;
        }
        int val = tail.val;
        tail = current;
        tail.next = null;
        size--;
        return val;
    }

    // Get the element at a specific position
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    // Get the first element
    public int getFirst() {
        if (head == null)
            throw new IllegalStateException("List is empty");
        return head.val;
    }

    // Get the last element
    public int getLast() {
        if (tail == null)
            throw new IllegalStateException("List is empty");
        return tail.val;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    public void printList() {
        ListNode current = head;
        System.out.println("| head");
        System.out.println("V");
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
