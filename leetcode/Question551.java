package leetcode;
// Student Attendance Record I
public class Question551 {
    private static boolean checkRecord(String s) {
        boolean isAbs = false;
        int lateCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'A') {
                if (!isAbs) {
                    isAbs = true;
                } else {
                    return false;
                }
                lateCount = 0;
            } else if (currentChar == 'L') {
                if (lateCount == 2) {
                    return false;
                } else {
                    lateCount++;
                }

            } else {
                lateCount = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String s = "PPALLP";
        String s = "PPALLL";
        System.out.println(checkRecord(s));
    }
}
