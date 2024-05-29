// package Questions;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        String s = "my name is vijay";
        StringBuilder result = new StringBuilder();
        for (final String temp : s.split(" ")) {
            String[] temparr = temp.split("");
            for (int i = temparr.length - 1; i >= 0; i--) {
                if (i == temparr.length - 1) {
                    result.append(temparr[i].toUpperCase());
                    continue;
                }
                result.append(temparr[i]);
            }
            result.append(" ");
        }
        System.out.println(result);
    }
}