package geeksforgeeks;

// LCM And GCD
import java.util.Arrays;

public class LCMAndGCD {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] result = new Long[2];
        Long LCM = A * B;

        while (B > 0) {
            Long remain = A % B;
            A = B;
            B = remain;
        }

        result[0] = LCM / A;
        result[1] = A;

        return result;
    }

    public static void main(String[] args) {
        Long a = 5l, b = 10l;
        System.out.println(Arrays.toString(lcmAndGcd(a, b)));
    }
}
