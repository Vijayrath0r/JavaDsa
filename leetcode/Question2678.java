package leetcode;

// Number of Senior Citizens
public class Question2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String str : details) {
            if (((str.charAt(11) - '0') * 10 + (str.charAt(12) - '0')) > 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question2678 solution = new Question2678();
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        System.out.println(solution.countSeniors(details));
    }
}
