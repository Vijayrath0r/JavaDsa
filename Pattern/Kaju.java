import java.util.Scanner;

public class Kaju {
    public static void main(String[] args) {
        System.out.println("Enter the height of kaju - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(new String(new char[n - i]).replace('\0', ' ') + new String(new char[n]).replace('\0', '*'));
        }
    }
}
