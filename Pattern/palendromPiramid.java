import java.util.Scanner;

public class palendromPiramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of Piramid - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        sc.close();
        String str = "1";
        for (int i = 1; i < n; i++) {
            System.out.println(new String(new char[n - i - 1]).replace('\0', ' ') + str);
            str = (i + 1) + str + (i + 1);
        }
    }
}
