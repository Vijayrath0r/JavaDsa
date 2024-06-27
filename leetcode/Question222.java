package leetcode;

// Count Complete Tree Nodes
public class Question222 {
    public int countHeight(TreeNode node, boolean isLeft) {
        int count = 0;
        if (isLeft) {
            while (node != null) {
                count++;
                node = node.left;
            }
        } else {
            while (node != null) {
                count++;
                node = node.right;
            }
        }
        return count;
    }

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int hLeft = countHeight(root, true);
        int hRight = countHeight(root, false);

        if (hLeft == hRight) {
            return (1 << hLeft) - 1; // (2^hLeft) - 1
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        Question222 solution = new Question222();
        Integer[] tree = { 1, 2, 3, 4, 5, 6 };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);
        System.out.println(solution.countNodes(root));
    }
}
