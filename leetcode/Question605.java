package leetcode;
//Can Place Flowers
public class Question605 {
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 0, 1 };
        // int n = 1;
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
