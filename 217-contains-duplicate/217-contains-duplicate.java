class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet hashSet = new HashSet();
        for (Integer in : nums) {

            if (hashSet.contains(in)){
                return true;
            }else{
                hashSet.add(in);
            }
        }return false;
    }
}