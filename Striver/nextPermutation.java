package Striver;

import java.util.Arrays;

public class nextPermutation {
    public static int[] swap(int[] arr, int pos1, int pos2) {
        int temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 5, 4, 2 }; // ANS - [1, 4, 2, 3, 5]
        // int[] arr = { 1,3,2 }; // ANS - [2,1,3]
        // int[] arr = { 2, 1, 3 }; //ANS - [2, 3, 1]
        // int[] arr = { 2, 3, 1 }; //ANS - [3, 1, 2]
        // int[] arr = { 5, 4, 3, 2, 1 }; // ANS - [1,2,3,4,5]
        // int[] arr = {2,3,1,3,3}; //ANS - [2,3,3,1,3]
        int[] arr = {2,2,4,0,1,2,4,4,0}; //ANS - [2,2,4,0,1,4,0,2,4]
        int elementToSwap = 0;
        int elementToSwapPos = 0;
        int elementWithSwap = 0;
        int elementWithSwapPos = 0;
        int arrLenght = arr.length;
        boolean isDes = false;
        System.out.println(Arrays.toString(arr));
        for (int i = arrLenght - 1; i >= 0; i--) {
            if (i == 0) {
                elementToSwapPos = -1;
                isDes = true;
                break;
            }
            if (arr[i - 1] < arr[i]) {
                elementToSwap = arr[i - 1];
                elementToSwapPos = i - 1;
                break;
            }
        }
        if (!isDes) {
            for (int i = elementToSwapPos; i < arrLenght; i++) {
                if (elementToSwap < arr[i]) {
                    if (elementWithSwapPos == 0) {
                        elementWithSwap = arr[i];
                        elementWithSwapPos = i;
                    } else if (elementWithSwap > arr[i]) {
                        elementWithSwapPos = i;
                    }
                }
                if (i == arrLenght - 1 && elementWithSwapPos == 0) {
                    elementWithSwapPos = i;
                    break;
                }
            }
            arr = swap(arr, elementToSwapPos, elementWithSwapPos);
        }
        int temp=0;
        for (int i = elementToSwapPos+1; i < arrLenght; i++) {
            for (int j = elementToSwapPos+1; j < arrLenght-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
