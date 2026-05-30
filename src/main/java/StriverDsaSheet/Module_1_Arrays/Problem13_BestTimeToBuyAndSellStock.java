package StriverDsaSheet.Module_1_Arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Problem13_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int bestTimeToBuy = 0;
        int maxProfit = 0;

        for (int i=1; i<prices.length; i++) {
            if (prices[i]<prices[bestTimeToBuy]) {
                bestTimeToBuy = i;
            }
            else {
                maxProfit = Math.max(maxProfit, prices[i]-prices[bestTimeToBuy]);
            }
        }

        return maxProfit;
    }
}
