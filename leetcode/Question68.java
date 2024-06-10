package leetcode;

// Text Justification
import java.util.ArrayList;
import java.util.List;

public class Question68 {
    private static void getStringOfList(List<String> list, List<String> result, int maxWidth, boolean lastLine) {
        int strLen = String.join("", list).length();
        int wordCount = list.size();
        StringBuilder sb = new StringBuilder();

        if (wordCount == 1 || lastLine) {
            sb.append(String.join(" ", list));
            while (sb.length() < maxWidth) {
                sb.append(" ");
            }
            result.add(sb.toString());
            return;
        }

        if (strLen + wordCount - 1 == maxWidth) {
            result.add(String.join(" ", list));
            return;
        }

        int totalSpaces = maxWidth - strLen;
        int baseSpace = totalSpaces / (wordCount - 1);
        int extraSpaces = totalSpaces % (wordCount - 1);

        for (int i = 0; i < wordCount - 1; i++) {
            sb.append(list.get(i));
            for (int j = 0; j < baseSpace + (i < extraSpaces ? 1 : 0); j++) {
                sb.append(" ");
            }
        }
        sb.append(list.get(wordCount - 1));
        result.add(sb.toString());
    }

    private static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        int currentLen = 0;
        for (String word : words) {
            int wordLen = word.length();
            if (currentLen + wordLen > maxWidth) {
                getStringOfList(temp, result, maxWidth, false);
                temp.clear();
                currentLen = 0;
            }
            temp.add(word);
            currentLen += wordLen + 1;
        }
        getStringOfList(temp, result, maxWidth, true);
        return result;
    }

    public static void main(String[] args) {
        // String[] words = { "This", "is", "an", "example", "of", "text",
        // "justification." };
        // String[] words = { "What", "must", "be", "acknowledgment", "shall", "be" };
        String[] words = { "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a",
                "computer.", "Art", "is", "everything", "else", "we", "do" };
        int maxWidth = 20;
        System.out.println(fullJustify(words, maxWidth));
    }
}
