package geeksforgeeks;
// Minimum Jumps

public class MinimumJumps {
    static int minJumps(int[] arr) {
        int currentMax = 0;
        int currentReach = 0;
        int jumps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && currentMax <= i) {
                return -1;
            }
            currentMax = Math.max(currentMax, i + arr[i]);

            if (i == currentReach) {
                jumps++;
                currentReach = currentMax;
            }
        }

        return arr.length > 1 && jumps == 0 ? -1 : jumps;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // int arr[] = { 1, 4, 3, 2, 6, 7 };
        // int arr[] = { 0, 10, 20 };
        // int arr[] = { 4, 3, 2, 1, 0, 1 };
        int arr[] = { 9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1 };
        System.out.println(minJumps(arr));
    }
}
