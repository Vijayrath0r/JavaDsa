package Recursion;

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {
    public static int count = 0;

    public static void printTowerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Trasfer disk   " + n + " From " + source + " to " + destination);
            count++;
            return;
        }
        count++;
        printTowerOfHanoi(n - 1, source, destination, helper);
        System.out.println("Trasfer disk   " + n + " From " + source + " to " + destination);
        printTowerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Bigger disk number bigger disk size.
        printTowerOfHanoi(n, "Source", "Helper", "Destination");
        System.out.println("steps taken - " + count);

    }
}