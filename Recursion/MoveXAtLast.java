package Recursion;

public class MoveXAtLast {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length() - 1) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == 'x') {
            count++;
        } else {
            newString += currentChar;
        }
        moveAllX(str, idx + 1, count, newString);
    }

    public static void main(String[] args) {
        String str = "afkjxkjlxskjdxkxl";
        moveAllX(str, 0, 0, "");
    }
}
