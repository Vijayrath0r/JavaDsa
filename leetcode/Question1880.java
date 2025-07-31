class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int num1 = 0, num2 = 0, result = 0;
        for (char ch : firstWord.toCharArray()) {
            num1 = (ch - 'a') + num1 * 10;
        }
        for (char ch : secondWord.toCharArray()) {
            num2 = (ch - 'a') + num2 * 10;
        }
        for (char ch : targetWord.toCharArray()) {
            result = (ch - 'a') + result * 10;
        }
        return (num1 + num2 == result);
    }
}