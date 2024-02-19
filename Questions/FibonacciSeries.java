import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the length of Fibonacci Series - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int lastValue = 0;
        int currentValue = 1;
        System.out.print(lastValue + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(currentValue + " ");
            currentValue = lastValue + currentValue;
            lastValue = currentValue - lastValue;
        }
    }
}
