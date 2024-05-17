package leetcode;

// Simplify Path
import java.util.Stack;

public class Question71 {
    private static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");

        for (String currentString : paths) {
            if (currentString.equals("") || currentString.equals(".")) {
                continue;
            } else if (currentString.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(currentString);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        if (sb.length() == 0) {
            return "/";
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // String path = "/home/";
        // String path = "/home//foo/";
        // String path = "/home/user/Documents/../Pictures";
        // String path = "/../";
        // String path = "/.../a/../b/c/../d/./";
        String path = "/a/./b/../../c/"; // /c
        System.out.println(simplifyPath(path));
    }
}
