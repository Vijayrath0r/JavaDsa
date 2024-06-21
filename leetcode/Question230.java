package leetcode;

//  Kth Smallest Element in a BST
public class Question230 {
    private static int count = 0;
    private static int result = -1;

    private static void inOrderTraversal(TreeNode node, int k) {
        if (node == null)
            return;

        inOrderTraversal(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inOrderTraversal(node.right, k);
    }

    public static int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inOrderTraversal(root, k);
        return result;
    }

    public static void main(String[] args) {
        // Integer[] tree = { 3, 1, 4, null, 2 };
        // int k = 1;

        Integer[] tree = { 5, 3, 6, 2, 4, null, null, 1 };
        int k = 3;
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(kthSmallest(root, k));
    }
}
