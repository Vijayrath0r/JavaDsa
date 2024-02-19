import java.util.Scanner;

public class Recurssion {
    public static int factorial(int n){
        if(n<0){
            System.out.println("Invaild input");
        }
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter an number to find fectoriel");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
}
