package leetcode;

// Maximum Width of Binary Tree
import java.util.LinkedList;
import java.util.Queue;

/**
 * Question662
 */

public class Question662 {
    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 0));
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int min = queue.peek().getValue(); // The leftmost node's index
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode node = pair.getKey();
                int index = pair.getValue() - min; // Adjust the index to prevent overflow

                if (i == 0)
                    first = index;
                if (i == size - 1)
                    last = index;

                if (node.left != null)
                    queue.offer(new Pair<>(node.left, 2 * index));
                if (node.right != null)
                    queue.offer(new Pair<>(node.right, 2 * index + 1));
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        Question662 solution = new Question662();
        // Integer[] tree = { 1, 3, 2, 5, 3, null, 9 };
        // Integer[] tree = { 1, 3, 2, 5, null, null, 9, 6, null, 7 };
        // Integer[] tree = { 1, 3, 2, 5 };
        Integer[] tree = { 0, 0, 0, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0,
                null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0,
                0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null,
                0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null,
                null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0,
                null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0,
                0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null,
                0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null,
                null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0,
                null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0,
                0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null,
                0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null, null, 0, 0, null };
        TreeNode root = TreeNode.createTreeFromArray(tree);

        // TreeNode.printTree(root);
        System.out.println(solution.widthOfBinaryTree(root));
    }
}