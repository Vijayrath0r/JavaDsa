package leetcode;

// Find the Highest Altitude
public class Question1732 {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int num : gain) {
            currentAltitude += num;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        Question1732 solution = new Question1732();
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(solution.largestAltitude(gain));
    }
}
