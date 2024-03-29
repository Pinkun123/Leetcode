class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE; // minimum value buy
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ // profit // prices[i]=selling pric
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            } 
            else{// max
                 buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}