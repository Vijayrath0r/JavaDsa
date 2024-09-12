package leetcode;

// Excel Sheet Column Number
public class Question171A {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char ch : columnTitle.toCharArray()) {
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Question171A solution = new Question171A();
        // String columnTitle = "A";
        // String columnTitle = "AB";
        String columnTitle = "MKS";

        System.out.println(solution.titleToNumber(columnTitle));
    }

}
