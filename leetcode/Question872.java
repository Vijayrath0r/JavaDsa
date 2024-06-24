package leetcode;

// Leaf-Similar Trees
import java.util.ArrayList;
import java.util.List;

public class Question872 {
    private static void getLeaf(TreeNode root, List<Integer> leafs) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            leafs.add(root.val);
        } else {
            getLeaf(root.left, leafs);
            getLeaf(root.right, leafs);
        }
    }

    private static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        getLeaf(root1, tree1);
        getLeaf(root2, tree2);

        if (tree1.size() != tree2.size())
            return false;

        for (int i = 0; i < tree1.size(); i++) {
            if (!tree1.get(i).equals(tree2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Integer[] tree1 = { 3, 5, 1, 6, 2, 9, 8, null, null, 7, 4 },
        // tree2 = { 3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8 };

        // Integer[] tree1 = { 1, 2, 3 },
        // tree2 = { 1, 3, 2 };

        Integer[] tree1 = { 1, 2, 200 },
                tree2 = { 1, 2, 200 };
        TreeNode root1 = TreeNode.createTreeFromArray(tree1);
        TreeNode root2 = TreeNode.createTreeFromArray(tree2);

        TreeNode.printTree(root1);
        TreeNode.printTree(root2);

        System.out.println(leafSimilar(root1, root2));
    }
}
