package leetcode;

// Reverse String II
public class Question541 {
    private static char[] reverse(char[] arr, int start, int end) {
        char temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    private static String reverseStr(String s, int k) {
        char[] result = s.toCharArray();
        int len = result.length;
        for (int i = 0; i <= len / k; i++) {
            if (i % 2 == 0) {
                if (i * k + k - 1 >= len) {
                    result = reverse(result, i * k, len - 1);
                } else {
                    result = reverse(result, i * k, i * k + k - 1);
                }
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        // String s = "abcdefg";
        // int k = 2;

        String s = "abcdefghijkl";
        int k = 4;

        // String s = "a";
        // int k = 2;

        // String s = "abcdefg";
        // int k = 3;

        // String s = "abcdefg";
        // int k = 8;
        System.out.println(reverseStr(s, k));
    }
}
