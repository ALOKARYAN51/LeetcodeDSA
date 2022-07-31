class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length <1) return 0;
        int rsum=0;
        int lsum =0;
        for(int i: nums){
            rsum += i;
        }
        
        for(int i=0; i<nums.length; i++){
            rsum -= nums[i];
            if(rsum == lsum){
                return i;
            }else{
                lsum +=nums[i];
            }
        }
        return -1;
    }
}