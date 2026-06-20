class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;

       int minSale = prices[0];
       int maxSale = 0;

       for(int i=0; i<n; i++){
        if(prices[i] < minSale){
            minSale = prices[i];
        }
        else{
            int data = prices[i] - minSale;
            maxSale = Math.max(maxSale,data);
        }
       } 
       return maxSale;
    }
}
