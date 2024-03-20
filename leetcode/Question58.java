package leetcode;

public class Question58 {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int strLen = 0;
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ' && strLen !=0) {
                return strLen;
            } else if(currentChar != ' ') {
                strLen++;
            }
        }
        return strLen;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        // String s = "   fly me   to   the moon  ";
        // String s = "luffy is still joyboy      ";
        System.out.println(lengthOfLastWord(s));
    }
}
