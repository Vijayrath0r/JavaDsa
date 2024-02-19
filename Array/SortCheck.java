package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortCheck {
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
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted in accending order");
                return;
            }
        }
        System.out.println("Array is sorted in accending order");
    }
}
