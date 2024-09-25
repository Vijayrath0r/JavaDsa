package geeksforgeeks;

// Reverse an Array
import java.util.Arrays;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseArray solution = new ReverseArray();
        // int[] arr = { 1, 2, 3, 4 };
        int[] arr = { 1, 2, 3, 4, 5 };
        solution.reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
