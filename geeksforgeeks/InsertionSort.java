package geeksforgeeks;
// Insertion Sort

import java.util.Arrays;

public class InsertionSort {
    static void insert(int arr[], int i) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        InsertionSort solution = new InsertionSort();
        int N = 5;
        int[] arr = { 4, 1, 3, 9, 7 };

        solution.insertionSort(arr, N);
        System.out.println(Arrays.toString(arr));
    }
}
