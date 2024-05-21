package leetcode;

//Reverse Vowels of a String
public class Question345 {
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char temp;
        StringBuilder myName = new StringBuilder(s);
        while (start < end) {
            while (start < end && !isVowel(myName.charAt(start))) {
                start++;
            }
            while (start < end && !isVowel(myName.charAt(end))) {
                end--;
            }
            if (start < end) {
                temp = myName.charAt(start);
                myName.setCharAt(start, myName.charAt(end));
                myName.setCharAt(end, temp);
                start++;
                end--;
            }

        }
        return myName.toString();
    }

    public static void main(String[] args) {
        // String s = "hello";
        String s = ".,";
        System.out.println(reverseVowels(s));
    }
}
