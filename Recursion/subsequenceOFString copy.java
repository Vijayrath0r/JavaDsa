package Recursion;

public class subsequenceOFString {
    public static void printSubsequence(String str,int idx,String newString){
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(idx);
        //to be
        printSubsequence(str, idx+1, newString+currentChar);
        //not to be
        printSubsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "ABC";
        printSubsequence(str, 0, "");
    }
}
