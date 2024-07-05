package leetcode;

/**
 * Question450 - Delete Node in a BST
 */
public class Question450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // conditions for single or no child node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = minValue(root.right);

            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    // A utility function to find the minimum value node
    int minValue(TreeNode root) {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        Question450 solution = new Question450();
        Integer[] tree = { 5, 3, 6, 2, 4, null, 7 };
        int key = 3;
        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        TreeNode result = solution.deleteNode(root, key);
        TreeNode.printTree(result);
    }
}