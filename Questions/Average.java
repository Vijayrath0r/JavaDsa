import java.util.Scanner;

/**
 * Average
 */
public class Average {
    public static float average(int a, int b, int c) {
        return (float)(a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Please enter three numbers - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(average(a, b, c));
        sc.close();
        return;
    }
}