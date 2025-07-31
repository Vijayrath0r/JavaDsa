class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        boolean reversed = false;
        for(char c :word.toCharArray()){
            sb.append(c);
            if (c == ch && !reversed) {
                sb = sb.reverse();
                reversed = true;
            }
        }
        return sb.toString();
    }
}