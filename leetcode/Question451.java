package leetcode;

// Sort Characters By Frequency
import java.util.Arrays;

public class Question451 {
    public String frequencySort(String s) {
        int[][] arr = new int[128][2]; // Using 128 to cover all ASCII characters
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            arr[ch][0] = ch;
            arr[ch][1]++;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i][1]; j++) {
                result.append((char) arr[i][0]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Question451 solution = new Question451();
        // String s = "AZavzAa";
        // String s = "2a554442f544asfasssffffasss";
        String s = "2a554442f544asfasssffffasss";

        System.out.println((int) '1');
        System.out.println(solution.frequencySort(s));
    }
}
