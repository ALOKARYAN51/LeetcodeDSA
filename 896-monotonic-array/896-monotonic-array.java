class Solution {
    public boolean isMonotonic(int[] nums) {
    if (nums.length <= 1) return true;
    int m = 0, n = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] >= nums[i-1]) m++;
        if (nums[i] <= nums[i-1]) n++;
    }
    if (m == nums.length - 1) return true;
    else if (n == nums.length - 1) return true;
    else return false;
}
}