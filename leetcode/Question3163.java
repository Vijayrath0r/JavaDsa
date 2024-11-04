package leetcode;

// 3163. String Compression III
public class Question3163 {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        char lastChar = '.';
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch == lastChar) {
                count++;
                if (count == 10) {
                    comp.append(9);
                    comp.append(lastChar);
                    count = 1;
                }
            } else {
                if (count != 0) {
                    comp.append(count);
                    comp.append(lastChar);
                }
                count = 1;
                lastChar = ch;
            }
        }
        if (count != 0) {
            comp.append(count);
            comp.append(lastChar);
        }
        return comp.toString();
    }

    public static void main(String[] args) {
        Question3163 solution = new Question3163();
        // String word = "abcde";
        String word = "aaaaaaaaaaaaaabb";

        System.out.println(solution.compressedString(word));
    }
}
