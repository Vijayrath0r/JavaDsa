package leetcode;

// Binary Tree Right Side View
import java.util.ArrayList;
import java.util.List;

public class Question199 {
    private static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        while (root != null) {
            result.add(root.val);
            if (root.right != null) {
                root = root.right;
            } else if (root.left != null) {
                root = root.left;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, 2, 3, null, 5, null, 4 };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        System.out.println(rightSideView(root));
    }
}
