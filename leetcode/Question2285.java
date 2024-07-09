package leetcode;

// Maximum Total Importance of Roads
import java.util.Arrays;
import java.util.Comparator;

public class Question2285 {
    public long maximumImportance(int n, int[][] roads) {
        long importance = 0;
        int[] degree = new int[n];

        // Calculate the degree of each node
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }

        // Create an array of pairs (degree, original index)
        int[][] indexedPair = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedPair[i][0] = degree[i];
            indexedPair[i][1] = i;
        }

        Arrays.sort(indexedPair, Comparator.comparingInt(a -> a[0]));

        int idx = 1;
        int[] importanceValues = new int[n];
        for (int[] pair : indexedPair) {
            importanceValues[pair[1]] = idx++;
        }

        // Calculate the total importance
        for (int[] road : roads) {
            importance += importanceValues[road[0]] + importanceValues[road[1]];
        }

        return importance;
    }

    public static void main(String[] args) {
        Question2285 solution = new Question2285();
        int n = 5;
        int[][] roads = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
        // int[][] roads = { { 0, 3 }, { 2, 4 }, { 1, 3 } };

        System.out.println(solution.maximumImportance(n, roads));
    }
}
