package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle; // Return empty list if numRows is not positive
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row= new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i){
                    row.add(1);
                } else {
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
