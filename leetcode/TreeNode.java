package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    // Static method to create a binary tree from nested arrays
    public static TreeNode createTree(Object[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        // Create the root node
        TreeNode root = new TreeNode((int) array[0]);

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
    public static TreeNode createTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < array.length) {
            TreeNode node = queue.poll();

            // Left child
            if (index < array.length && array[index] != null) {
                node.left = new TreeNode(array[index]);
                queue.offer(node.left);
            }
            index++;

            // Right child
            if (index < array.length && array[index] != null) {
                node.right = new TreeNode(array[index]);
                queue.offer(node.right);
            }
            index++;
        }

        return root;
    }

    // Static method to print the binary tree
    public static void printTree(TreeNode node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }

        System.out.println("Binary Tree:");
        printTreeHelper(node, "", true);
    }

    // Helper method to recursively print the tree
    private static void printTreeHelper(TreeNode node, String indent, boolean isRight) {
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
        System.out.println("----- " + node.val);

        // Recursively print left subtree
        printTreeHelper(node.left, indent + (isRight ? " |      " : "        "), false);
    }

    // Static method for in-order traversal
    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    // Static method for pre-order traversal
    public static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Static method for post-order traversal
    public static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }
}
