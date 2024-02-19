import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a = ");
        int a = sc.nextInt();
        System.out.println("Enter value for b = ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Both numbers are equal");
        } else if (a > b) {
            System.out.println("Number a is greater than number b");
        } else {
            System.out.println("Number b is greater than number a");
        }
        sc.close();
    }
}
