package leetcode;

// Average Waiting Time
public class Question1701 {
    public double averageWaitingTime(int[][] customers) {
        long waitingTime = 0;
        int cheifTime = customers[0][0];
        for (int[] customer : customers) {
            if (customer[0] >= cheifTime) {
                cheifTime = customer[0] + customer[1];
                waitingTime += customer[1];
            } else {
                cheifTime += customer[1];
                waitingTime += cheifTime - customer[0];
            }
        }
        return (double) waitingTime / customers.length;
    }

    public static void main(String[] args) {
        Question1701 solution = new Question1701();
        // int[][] customers = { { 1, 2 }, { 2, 5 }, { 4, 3 } };
        // int[][] customers = { { 5, 2 }, { 5, 4 }, { 10, 3 }, { 20, 1 } };
        // int[][] customers = { { 5, 2 }, { 5, 4 }, { 10, 3 }, { 20, 1 }, { 21, 30 }, {
        // 22, 11 } };
        int[][] customers = { { 5, 2 }, { 5, 4 }, { 10, 3 }, { 20, 1 }, { 21, 30 }, { 22, 11 } };
        System.out.println(solution.averageWaitingTime(customers));
        System.out.println("Expected 13.83333");
    }
}
