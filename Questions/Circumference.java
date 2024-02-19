import java.util.Scanner;

public class Circumference { 
    public static final float PI = 3.14f;
    public static void raduisOfCircle(int r){
        System.out.println("Radius of circle is - " + 2*PI*r);
    }
    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle.");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        raduisOfCircle(r);        
    }
}
