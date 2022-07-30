class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n, a = temp % 10, b = temp % 10;
        temp /= 10;
        while (temp > 0) {
            int res = temp % 10;
            a *= res;
            b += res;
            temp /= 10;
        }
        return a - b;
    }
}