class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = prices[0];
        int max = 0;

        for(int i=1; i<n; i++){
            if(profit > prices[i]){
                profit = prices[i];
            }
            else{
                int data =   prices[i] - profit;
                max = Math.max(max,data);
            }
        }
        return max;
    }
}