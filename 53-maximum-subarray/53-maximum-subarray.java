class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar =nums[0];
        int currentmax = nums[0];
        
        for(int i=1; i<nums.length; i++){
            currentmax = currentmax + nums[i];
            
            if(nums[i]>currentmax){
                currentmax = nums[i];
            }
            if(maxsofar < currentmax){
                maxsofar = currentmax;
            }
        }
        return maxsofar;
    }
}