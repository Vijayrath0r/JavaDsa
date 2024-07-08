package leetcode;

// Minimum Number of Vertices to Reach All Nodes
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        int[] inBound = new int[n];
        for (List<Integer> edge : edges) {
            ++inBound[edge.get(1)];
        }
        for (int i = 0; i < n; i++) {
            if (inBound[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Question1557 solution = new Question1557();
        int n = 6;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4),
                Arrays.asList(4, 2));

        System.out.println(solution.findSmallestSetOfVertices(n, edges));
    }
}
