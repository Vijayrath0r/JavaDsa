package leetcode;

// Largest Odd Number in String
public class Question1903 {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Question1903 solution = new Question1903();
        String num = "52";
        System.out.println(solution.largestOddNumber(num));
    }
}
