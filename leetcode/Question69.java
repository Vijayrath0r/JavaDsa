package leetcode;

public class Question69 {

    public static int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (mid > x / mid) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        // int x = 0;
        // int x = 1;
        // int x = 625; // 25
        // int x = 1224; // 34
        // int x = 214745; // ANS 463.4058696218683
        // int x = 2147483647; // ANS 46340.95
        int x = 2147395599; // ANS 46339
        System.out.println(mySqrt(x));
    }
}
