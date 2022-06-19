class Solution {
    public int findDuplicate(int[] nums) {
        int val =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                val = nums[i];
            }
        }
        return val;
    }
}