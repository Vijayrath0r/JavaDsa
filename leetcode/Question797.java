package leetcode;

// All Paths From Source to Target
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Question797 {
    private void helper(int[][] graph, int idx, Deque<Integer> path, List<List<Integer>> result) {
        if (idx == graph.length - 1) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int next : graph[idx]) {
            path.addLast(next);
            helper(graph, next, path, result);
            path.removeLast();
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        path.addLast(0);
        helper(graph, 0, path, result);
        return result;
    }

    public static void main(String[] args) {
        Question797 solution = new Question797();
        // int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
        // int[][] graph = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };
        int[][] graph = { { 4, 3, 1 }, { 3, 2, 4 }, {}, { 4 }, {} };

        System.out.println(solution.allPathsSourceTarget(graph));
    }
}
