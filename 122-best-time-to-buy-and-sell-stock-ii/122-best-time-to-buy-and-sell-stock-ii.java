class Solution {
    public int maxProfit(int[] prices) {
        int previousProfit = 0; 
		int totalProfit = 0;  
		int buyIndex = 0;   
		int currentProfit = 0; 
		
		for (int currentIndex = 1; currentIndex < prices.length; currentIndex++) {
			previousProfit = currentProfit; 
			currentProfit = prices[currentIndex] - prices[buyIndex]; 
			if (currentProfit < 0) {
				currentProfit = 0;
				buyIndex = currentIndex;
			}
			
			if(currentProfit < previousProfit){
				totalProfit = totalProfit + previousProfit;
				buyIndex = currentIndex;
				currentProfit = 0;
			}
		}
	
		if(currentProfit>0){
			totalProfit = totalProfit + currentProfit;
		}
		return totalProfit;
    }
}