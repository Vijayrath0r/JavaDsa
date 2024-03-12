/**
 * SecondHighestNumber
 */
public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = { 5, 9, 4, 3, 48, 36, 12, 7, 68, 55, 33, 4, 8, 1, 2, 9, 0 };
        int hn = Integer.MIN_VALUE, shn = Integer.MIN_VALUE;
        int sn = Integer.MAX_VALUE, ssn = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sn) {
                ssn = sn;
                sn = arr[i];
            } else if (arr[i] < ssn) {
                ssn = arr[i];
            }
            if (arr[i] > hn) {
                shn = hn;
                hn = arr[i];
            } else if (arr[i] > shn) {
                shn = arr[i];
            }
        }
        System.out.println(ssn);
        System.out.println(shn);
    }
}