package leetcode;

// String Compression
public class Question443 {
    private static int compress(char[] chars) {
        int pos = 1;
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (char ch : countStr.toCharArray()) {
                        chars[pos] = ch;
                        pos++;
                    }
                }
                chars[pos] = chars[i];
                pos++;
                count = 1;
            }
        }

        if (count > 1) {
            String countStr = Integer.toString(count);
            for (char ch : countStr.toCharArray()) {
                chars[pos] = ch;
                pos++;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' }; // 6
        // char[] chars = { 'a' }; // 1
        // char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
        // 'b', 'c' }; // 4
        System.out.println(compress(chars));
    }
}
