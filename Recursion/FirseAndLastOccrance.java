package Recursion;

public class FirseAndLastOccrance {
    public static int first = -1;
    public static int last = -1;

    public static void FindOccrance(String str, int idx, char target) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == target) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        FindOccrance(str, idx + 1, target);
    }

    public static void main(String[] args) {
        String str = "abcdajsdbdfkjhabssbajjjj";
        FindOccrance(str, 0, 'a');
    }
}
