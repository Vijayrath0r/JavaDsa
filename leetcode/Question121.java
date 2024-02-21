//121. Best Time to Buy and Sell Stock
package leetcode;

public class Question121 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 }; // ANS 5
        int[] prices = { 2, 4, 1 }; // ANS 2;
        System.out.println(maxProfit(prices));
    }
}
