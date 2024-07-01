package leetcode;

// Three Consecutive Odds
public class Question1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Question1550 solution = new Question1550();
        int[] arr = { 2, 6, 4, 1 };

        System.out.println(solution.threeConsecutiveOdds(arr));
    }
}
