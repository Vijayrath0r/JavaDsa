import java.util.Scanner;

public class GreaterNumber {
    public static String greaterNumber(int a, int b) {
        if (a == b) {
            return("Both numbers are equal");
        } else if (a > b) {
            return(a + " is greate then" + b);
        } else {
            return(b + " is greate then" + a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two number - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(greaterNumber(a, b));
    }
}
