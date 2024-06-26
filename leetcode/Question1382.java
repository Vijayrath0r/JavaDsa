package leetcode;

// Balance a Binary Search Tree
import java.util.ArrayList;
import java.util.List;

public class Question1382 {
    private List<TreeNode> makeList(TreeNode node, List<TreeNode> list) {
        if (node != null) {
            makeList(node.left, list);
            list.add(node);
            makeList(node.right, list);
        }
        return list;
    }

    private TreeNode makeTree(List<TreeNode> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = list.get(mid);
        root.left = makeTree(list, start, mid - 1);
        root.right = makeTree(list, mid + 1, end);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list = makeList(root, new ArrayList<>());
        return makeTree(list, 0, list.size() - 1);
    }

    public static void main(String[] args) {
        Question1382 solution = new Question1382();
        Integer[] tree = { 1, null, 2, null, 3, null, 4 };

        TreeNode root = TreeNode.createTreeFromArray(tree);
        TreeNode.printTree(root);

        TreeNode result = solution.balanceBST(root);
        TreeNode.printTree(result);
    }
}
