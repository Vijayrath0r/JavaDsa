package Striver;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 1, 1 },
        // { 1, 0, 1 },
        // { 1, 1, 1 }
        // };
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!rows.contains(i)) {
                        rows.add(i);
                    }
                    if (!cols.contains(j)) {
                        cols.add(j);
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.contains(i)||cols.contains(j)) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
