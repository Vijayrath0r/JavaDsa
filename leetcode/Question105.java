package leetcode;

//  Construct Binary Tree from Preorder and Inorder Traversal
import java.util.HashMap;

public class Question105 {
    private static TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> iMap) {
        if (preStart > preEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int mid = iMap.get(preorder[preStart]);
        int arrLen = mid - inStart;
        root.left = helper(preorder, preStart + 1, preStart + arrLen, inorder, inStart, mid - 1, iMap);
        root.right = helper(preorder, preStart + arrLen + 1, preEnd, inorder, mid + 1, inEnd, iMap);
        return root;
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> iMap = new HashMap<>();
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            iMap.put(inorder[i], i);
        }
        return helper(preorder, 0, len - 1, inorder, 0, len - 1, iMap);
    }

    public static void main(String[] args) {
        int[] preorder = { 3, 9, 20, 15, 7 },
                inorder = { 9, 3, 15, 20, 7 };

        // int[] preorder = { 1, 2, 4, 8, 16, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15 },
        // inorder = { 16, 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15 };
        TreeNode root = buildTree(preorder, inorder);
        TreeNode.printTree(root);
    }
}
