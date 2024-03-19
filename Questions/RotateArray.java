import java.util.Arrays;

/**
 * RotateArray
 */
public class RotateArray {
    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int temp;
        for (int i = n - 1; i >= 0; i--) {
            if (i - k >= 0) {
                temp = arr[i - k];
                arr[i - k] = arr[i];
                arr[i] = temp;
            } else {
                // System.out.println("i = " + i + " arr[i] = " + arr[i]);
                // temp = arr[n - i - k];
                // arr[n - i - k] = arr[i];
                // arr[i] = temp;
                // System.out.println(Arrays.toString(arr));
                // System.out.println(arr[i]);
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        rotate(arr, k);
    }
}