package Recursion;

public class PlaceTiles {
    public static int countPlacements(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int verticalPlacements = countPlacements(n - m, m);

        int horizonticalPlacements = countPlacements(n - 1, m);

        return verticalPlacements + horizonticalPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int result = countPlacements(n, m);
        System.out.println("Total possible placements - " + result);
    }
}
