class Solution {
    public int maxProfit(int[] prices) {
        int big=prices[0], max=0;
        for(int i=0;i<prices.length; i++){
            if(big>prices[i]){
                big=prices[i];
            }
            else if(prices[i]-big>max){
                max=prices[i]-big;
            }
        }
        return max;
    }
}
