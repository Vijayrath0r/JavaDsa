package geeksforgeeks;

import java.util.ArrayList;

/**
 * Find all factorial numbers less than or equal to n
 */
public class Findallfactorialnumbers {
    static void helper(long n, ArrayList<Long> result, Long num, Long count) {
        if (num > n) {
            return;
        }
        result.add(num);
        helper(n, result, num * (count + 1), count + 1);
    }

    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        helper(n, result, 1l, 1l);
        return result;
    }

    public static void main(String[] args) {
        int n = 120;
        System.out.println(factorialNumbers(n));
    }

}