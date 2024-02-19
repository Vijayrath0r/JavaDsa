import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a your age: ");
        int num = sc.nextInt();
        if(num>18){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
        sc.close();
    }
}
