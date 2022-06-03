class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet hashset = new HashSet();
        
        int n = nums.length;
        for(int i=0; i<n;i++){
            hashset.add(nums[i]);
        }
        
        for(int i=1; i<=n; i++){
            if(hashset.contains(i))
                continue;
               else{
                   list.add(i);
               }
        }
               return list;
    }
}