package leetcode;

//Valid Mountain Array
public class Question941 {
    private static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        boolean isUp = false;
        if (arr[0] < arr[1]) {
            isUp = true;
        } else {
            return false;
        }
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] == arr[i + 1]) || (!isUp && arr[i] < arr[i + 1])) {
                return false;
            } else if (isUp && arr[i] > arr[i + 1]) {
                isUp = false;
            }
        }
        return !isUp;
    }

    public static void main(String[] args) {
        // int[] arr = {2,1};
        int[] arr = { 3, 5, 5 };
        // int[] arr = { 0, 3, 2, 1 };
        // int[] arr = { 9,8,7,6,5,4,3,2,1,0 };
        // int[] arr = { 6, 7, 7, 8, 6 };
        System.out.println(validMountainArray(arr));
    }
}
