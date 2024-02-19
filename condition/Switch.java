import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter you choice \n 1. English \n 2. Hindi \n 3. Frence \n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namasate");
                break;
            case 3:
                System.out.println( "Bonjour" );
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        sc.close();
    }
}
