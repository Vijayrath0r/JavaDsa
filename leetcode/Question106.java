package leetcode;

// Construct Binary Tree from Inorder and Postorder Traversal
import java.util.HashMap;

public class Question106 {
    private static TreeNode helper(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> iMap) {
        if (postStart > postEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int mid = iMap.get(postorder[postEnd]);
        int arrLen = inEnd - mid;
        root.left = helper(postorder, postStart, postEnd - arrLen - 1, inorder, inStart, mid - 1, iMap);
        root.right = helper(postorder, postEnd - arrLen, postEnd - 1, inorder, mid + 1, inEnd, iMap);
        return root;
    }

    private static TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> iMap = new HashMap<>();
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            iMap.put(inorder[i], i);
        }
        return helper(postorder, 0, len - 1, inorder, 0, len - 1, iMap);
    }

    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7 },
                postorder = { 9, 15, 7, 20, 3 };

        // int[] inorder = { 4, 2, 5, 1, 6, 3, 7 },
        // postorder = { 4, 5, 2, 6, 7, 3, 1 };
        TreeNode root = buildTree(inorder, postorder);
        TreeNode.printTree(root);
    }
}
