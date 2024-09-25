package geeksforgeeks;

// Selection Sort
import java.util.Arrays;

public class SelectionSort {
    int select(int arr[], int i) {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        return minIdx;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int newIdx = select(arr, i);
            if (i != newIdx) {
                int temp = arr[i];
                arr[i] = arr[newIdx];
                arr[newIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort solution = new SelectionSort();
        int N = 5;
        int[] arr = { 4, 1, 3, 9, 7 };

        solution.selectionSort(arr, N);
        System.out.println(Arrays.toString(arr));
    }
}
