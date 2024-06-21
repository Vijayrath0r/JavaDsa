package leetcode;

//  Populating Next Right Pointers in Each Node II
import java.util.LinkedList;
import java.util.Queue;

public class Question117 {
    private static Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (prev != null) {
                    prev.next = current;
                }
                if (current == null) {
                    break;
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                prev = current;
            }
            if (prev != null) {
                prev.next = null;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // Integer[] tree = { 1, 2, 3, 4, 5, null, 7 };
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        Node.print(root);
        Node result = connect(root);
        Node.print(root);
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static void print(Node node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("Binary Tree:");
        printTreeHelper(node, "", true);
    }

    private static void printTreeHelper(Node node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }
        printTreeHelper(node.right, indent + (isRight ? "        " : " |      "), true);

        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.println("----- " + node.val);

        printTreeHelper(node.left, indent + (isRight ? " |      " : "        "), false);
    }
};