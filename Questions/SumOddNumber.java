import java.util.Scanner;

public class SumOddNumber {
    public static int sumOfOddNumbers(int n){
        int result = 0;
        for(int i = 0;i<=n;i++){
            if(i%2!=0){
                result = result +i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Please Enter an number to sum - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sumOfOddNumbers(n));
    }
}