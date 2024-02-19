import java.util.Scanner;

public class NumberPiramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of Piramid - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()+1;
        sc.close();
        for(int i = 1;i<=n;i++) {
            System.out.println( new String(new char[n-i-1]).replace('\0', ' ')+new String(new char[(i*2)-1]).replace('\0', (char) (i + '0')));
        }
    }
}
