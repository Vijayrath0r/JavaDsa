import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        System.out.println("Please Enter the height of the butterFly");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        sc.close();
        for (int i = 1; i <= n; i++) {
            if(i<=n/2){
                System.out.println( new String(new char[i]).replace('\0', '*') + new String(new char[(int)n - 2 * i]).replace('\0', ' ') + new String(new char[i]).replace('\0', '*'));
            } else {
                System.out.println( new String(new char[(int)n-i]).replace('\0', '*') + new String(new char[2 * i -(int)n]).replace('\0', ' ') + new String(new char[(int)n-i]).replace('\0', '*'));
            }
        }
    }
}
