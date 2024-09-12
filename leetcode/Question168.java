package leetcode;

public class Question168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            str.append((char) ((columnNumber % 26) + 'A'));
            columnNumber /=  26;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Question168 solution = new Question168();
        int columnNumber = 9093;

        System.out.println(solution.convertToTitle(columnNumber));
    }
}
