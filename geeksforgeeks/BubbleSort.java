package geeksforgeeks;

// Bubble Sort
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int[] arr = { 4, 1, 3, 9, 7 };
        bubbleSort(arr, N);
        System.out.println(Arrays.toString(arr));
    }
}
