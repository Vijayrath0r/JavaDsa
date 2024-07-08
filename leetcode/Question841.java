package leetcode;

// Keys and Rooms
import java.util.Arrays;
import java.util.List;

public class Question841 {
    public void helper(List<List<Integer>> rooms, int idx, boolean[] visited) {
        visited[idx] = true;
        for (int room : rooms.get(idx)) {
            if (!visited[room]) {
                helper(rooms, room, visited);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        helper(rooms, 0, visited);

        for (boolean isVisited : visited) {
            if (!isVisited) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Question841 solution = new Question841();
        // List<List<Integer>> edges = Arrays.asList(
        // Arrays.asList(1),
        // Arrays.asList(2),
        // Arrays.asList(3));

        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(),
                Arrays.asList(1));
        System.out.println(solution.canVisitAllRooms(edges));
    }
}
