package leetcode;

// Maximum Number of Vowels in a Substring of Given Length
public class Question1456 {
    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    private static int maxVowels(String s, int k) {
        int vCount = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < k; i++) {
            if (isVowel(arr[i])) {
                vCount++;
            }
        }
        int max = vCount;
        for (int i = k; i < arr.length; i++) {
            if (isVowel(arr[i - k])) {
                vCount--;
            }
            if (isVowel(arr[i])) {
                vCount++;
            }
            max = Math.max(max, vCount);
            if (max == k) {
                return max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

}
