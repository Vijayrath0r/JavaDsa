package leetcode;

//Number of Segments in a String
public class Question434 {
    private static int countSegments(String s) {
        int spaceCount = 0;
        int len = s.length() - 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                spaceCount++;
            }
        }
        if (len >= 0 && s.charAt(len) != ' ') {
            spaceCount++;
        }
        return spaceCount;
    }

    public static void main(String[] args) {
        // String s = "Hello, my name is John";
        // String s = "";
        String s = ", , , , a, eaefa";
        // String s = "a";
        System.out.println(countSegments(s));
    }
}
