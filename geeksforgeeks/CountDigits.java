package geeksforgeeks;

public class CountDigits {
    static int evenlyDivides(int N) {
        int count = 0, num = N;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit != 0 && N % lastDigit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // int N = 12;
        // int N = 2446;
        int N = 22074;
        System.out.println(evenlyDivides(N));
    }
}
