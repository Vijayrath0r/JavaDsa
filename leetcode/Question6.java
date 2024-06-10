package leetcode;

// Zigzag Conversion
public class Question6 {
    private static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] zigzagStr = new StringBuilder[numRows];
        int row = 0;
        boolean isIncreasing = true;

        for (char c : s.toCharArray()) {
            if (zigzagStr[row] == null) {
                zigzagStr[row] = new StringBuilder();
            }
            zigzagStr[row].append(c);

            if (isIncreasing) {
                row++;
            } else {
                row--;
            }

            if (row == 0 || row == numRows - 1) {
                isIncreasing = !isIncreasing;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : zigzagStr) {
            result.append(sb);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        // String s = "AB";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }
}
