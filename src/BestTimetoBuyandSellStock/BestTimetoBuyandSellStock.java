package BestTimetoBuyandSellStock;

import java.util.Arrays;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length<2)
            return 0;

        int profit=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            profit=Integer.max(profit,prices[i]-min);
            min=Integer.min(min,prices[i]);
        }
         return profit;
    }

}
