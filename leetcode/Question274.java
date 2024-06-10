package leetcode;

// H-Index
import java.util.Arrays;

public class Question274 {
    private static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        int n = citations.length;

        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] > hIndex) {
                hIndex++;
            } else {
                break;
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int[] citations = { 3, 0, 6, 1, 5 };
        // int[] citations = { 1, 2, 1 };
        System.out.println(hIndex(citations));
    }
}
