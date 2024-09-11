package leetcode;

public class Question476 {
    public int findComplement(int num) {
        int count = 0, tempNum = num;
        while (num != 0) {
            count++;
            num >>= 1;
        }
        return tempNum ^ (1 << count) - 1;
    }

    public static void main(String[] args) {
        Question476 solution = new Question476();
        // int num = 5;
        int num = 1;

        System.out.println(solution.findComplement(num));
    }
}
