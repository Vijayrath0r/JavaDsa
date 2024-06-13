package leetcode;

// Minimum Number of Moves to Seat Everyone
import java.util.Arrays;

public class Question2037 {
    private static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;

        for (int i = 0; i < students.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }

    public static void main(String[] args) {
        int[] seats = { 3, 1, 5 }, students = { 2, 7, 4 };
        System.out.println(minMovesToSeat(seats, students));
    }
}
