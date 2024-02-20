package leetcode;

import java.util.Arrays;

public class Question31 {
    public static int[] swap(int[] arr, int pos1, int pos2) {
        int temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        return arr;
    }

    public static void nextPermutation(int[] nums) {
        int elementToSwap = 0;
        int elementToSwapPos = 0;
        int elementWithSwap = 0;
        int elementWithSwapPos = 0;
        int arrLenght = nums.length;
        boolean isDes = false;
        for (int i = arrLenght - 1; i >= 0; i--) {
            if (i == 0) {
                elementToSwapPos = -1;
                isDes = true;
                break;
            }
            if (nums[i - 1] < nums[i]) {
                elementToSwap = nums[i - 1];
                elementToSwapPos = i - 1;
                break;
            }
        }
        if (!isDes) {
            for (int i = elementToSwapPos; i < arrLenght; i++) {
                if (elementToSwap < nums[i]) {
                    if (elementWithSwapPos == 0) {
                        elementWithSwap = nums[i];
                        elementWithSwapPos = i;
                    } else if (elementWithSwap > nums[i]) {
                        elementWithSwapPos = i;
                    }
                }
                if (i == arrLenght - 1 && elementWithSwapPos == 0) {
                    elementWithSwapPos = i;
                    break;
                }
            }
            nums = swap(nums, elementToSwapPos, elementWithSwapPos);
        }
        int temp=0;
        for (int i = elementToSwapPos+1; i < arrLenght; i++) {
            for (int j = elementToSwapPos+1; j < arrLenght-1; j++) {
                if(nums[j]>nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 4, 2 };
        nextPermutation(nums);
    }
}
