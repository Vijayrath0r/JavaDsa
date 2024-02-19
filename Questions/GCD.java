import java.util.Scanner;

public class GCD {
    public static void findGCD(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(num1 + " is the GCD");
            return;
        }
        if (num1 > num2) {
            num2 = num1+num2;
            num1 = num1-num1;
        }
        if (num2 % num1 == 0) {
            System.out.println(num1 + " is the GCD");
            return;
        }
        for (int i = num1 / 2; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i + " is the GCD");
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers to find GCD - ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        findGCD(num1, num2);
    }
}
