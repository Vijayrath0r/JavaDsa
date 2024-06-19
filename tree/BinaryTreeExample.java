import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode {
    int value;
    BinaryTreeNode left, right;

    BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // Static method to create a binary tree from nested arrays
    public static BinaryTreeNode createTree(Object[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        // Create the root node
        BinaryTreeNode root = new BinaryTreeNode((int) array[0]);

        // Recursively create left and right children
        if (array.length > 1 && array[1] != null) {
            root.left = createTree((Object[]) array[1]);
        }
        if (array.length > 2 && array[2] != null) {
            root.right = createTree((Object[]) array[2]);
        }

        return root;
    }

    // Method to create a binary tree from level-order array representation
    public static BinaryTreeNode createTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(array[0]);
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < array.length) {
            BinaryTreeNode node = queue.poll();

            // Left child
            if (index < array.length && array[index] != null) {
                node.left = new BinaryTreeNode(array[index]);
                queue.offer(node.left);
            }
            index++;

            // Right child
            if (index < array.length && array[index] != null) {
                node.right = new BinaryTreeNode(array[index]);
                queue.offer(node.right);
            }
            index++;
        }

        return root;
    }

    // Static method to print the binary tree
    public static void printTree(BinaryTreeNode node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }

        System.out.println("Binary Tree:");
        printTreeHelper(node, "", true);
    }

    // Helper method to recursively print the tree
    private static void printTreeHelper(BinaryTreeNode node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        // Recursively print right subtree
        printTreeHelper(node.right, indent + (isRight ? "        " : " |      "), true);

        // Print current node
        System.out.print(indent);
        if (isRight) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.println("----- " + node.value);

        // Recursively print left subtree
        printTreeHelper(node.left, indent + (isRight ? " |      " : "        "), false);
    }

    // Static method for in-order traversal
    public static void inOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    // Static method for pre-order traversal
    public static void preOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Static method for post-order traversal
    public static void postOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        Object[] values = { 1,
                new Object[] { 2,
                        new Object[] { 4,
                                new Object[] { 8, null, null },
                                new Object[] { 9, null, null }, null },
                        new Object[] { 5,
                                new Object[] { 10, null, null },
                                new Object[] { 11, null, null } } },
                new Object[] { 3,
                        new Object[] { 6,
                                new Object[] { 12, null, null },
                                new Object[] { 13, null, null } },
                        new Object[] { 7,
                                new Object[] { 14, null, null },
                                new Object[] { 15, null, null } } } };

        BinaryTreeNode root = BinaryTreeNode.createTree(values);

        BinaryTreeNode.printTree(root);
        Integer[] arr = { -10, 9, 20, null, null, 15, 7 };
        BinaryTreeNode rootNew = BinaryTreeNode.createTreeFromArray(arr);

        BinaryTreeNode.printTree(rootNew);
        System.out.print("In-order Traversal: ");
        BinaryTreeNode.inOrderTraversal(root);
        System.out.println();

        System.out.print("Pre-order Traversal: ");
        BinaryTreeNode.preOrderTraversal(root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        BinaryTreeNode.postOrderTraversal(root);
        System.out.println();
    }
}
