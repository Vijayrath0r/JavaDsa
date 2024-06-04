package leetcode;

// Best Time to Buy and Sell Stock II
public class Question122 {
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        Integer buy = null, sell = null;
        for (final int price : prices) {
            if (buy == null) {
                buy = price;
            } else if ((buy != null && (price < buy)) || (sell != null && price < sell)) {
                if (sell != null) {
                    maxProfit += sell - buy;
                    sell = null;
                }
                buy = price;
            } else if (sell == null || sell < price) {
                sell = price;
            }
        }
        if (sell != null) {
            maxProfit += sell - buy;
            sell = null;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 }; // 7
        // int[] prices = { 1, 2, 3, 4, 5 }; // 4
        int[] prices = { 7, 6, 4, 3, 1 }; // 0
        System.out.println(maxProfit(prices));
    }
}
