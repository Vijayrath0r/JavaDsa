package leetcode;

/**
 * Question921 - Minimum Add to Make Parentheses Valid
 */
public class Question921 {
    public int minAddToMakeValid(String s) {
        int count = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("run");
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                result += Math.abs(count);
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("test");
        Question921 solution = new Question921();
        String s = "())";
        System.out.println(s);
        System.out.println(solution.minAddToMakeValid(s));
        System.out.println("temo");
    }
}