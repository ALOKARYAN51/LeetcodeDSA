class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int min =0;
        
        for(int i=1; i<prices.length; i++){
            int sum = prices[i]-prices[min];
            if(sum<0){
                min =i;
            }else{
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}