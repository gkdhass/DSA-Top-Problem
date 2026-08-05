class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;
        int n = tickets.length;
        for(int  i = 0; i<n; i++){
            if(i <= k) {
                total += Math.min(tickets[i] , tickets[k]);
            }
            else{
                total += Math.min(tickets[i] , tickets[k] - 1);
            }
        }
        return total;
    }
}