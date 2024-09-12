package leetcode;

// Pascal's Triangle II
import java.util.ArrayList;
import java.util.List;

public class Question119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
            result.add(1);
        }
        return result;
    }

    public static void main(String[] args) {
        Question119 solution = new Question119();

        int rowIndex = 33;

        System.out.println(solution.getRow(rowIndex));
    }
}
