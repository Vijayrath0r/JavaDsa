import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Enter the height of kaju - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        sc.close();
        for (int i = 1; i < n; i++) {
            if (i <= (int) n / 2) {
                System.out.println(new String(new char[((int) n / 2 - i)]).replace('\0', ' ')
                        + new String(new char[i * 2 - 1]).replace('\0', '*'));
            } else {
                System.out.println(
                        new String(new char[n % 2 == 0 ? (i - (int) n / 2) : (i - 1 - (int) n / 2)]).replace('\0', ' ')
                                + new String(new char[((int) n - i) * 2 - 1]).replace('\0', '*'));
            }
        }

    }
}
