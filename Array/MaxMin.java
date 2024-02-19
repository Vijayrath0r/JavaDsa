package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array - ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter " + len + " values - ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("**************************************************************");
        System.out.println(Arrays.toString(arr));
        System.out.println("**************************************************************");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min is = "+ min + "\nmax is - "+ max);
    }
}
