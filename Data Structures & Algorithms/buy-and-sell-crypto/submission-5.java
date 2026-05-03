class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int profit = 0;

        while (r < prices.length) {
            if(prices[r] < prices[l]){
                l = r;
               
            }
            else{
                int temp  = prices[r] - prices[l];
                profit = Math.max(profit,temp);
            }
             r++;
        }
        return profit;
    }
}
