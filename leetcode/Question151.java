package leetcode;

// Reverse Words in a String
public class Question151 {
    private static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            str.append(arr[i]);
            if (i > 0) {
                str.append(" ");
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        // String s = " the sky is blue ";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
