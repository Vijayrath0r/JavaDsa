package leetcode;

//  Guess Number Higher or Lower
public class Question374 {
    public int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int num = guess(mid);
            if (num == -1) {
                end = mid - 1;
            } else if (num == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
