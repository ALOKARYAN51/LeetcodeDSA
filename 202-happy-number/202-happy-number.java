class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<Integer>();
        int sum, rem;
        while(st.add(n)){
            sum =0;
            while(n>0){
                rem = n%10;
                sum += rem*rem;
                n = n/10;
            }
            
            if(sum == 1){
                return true;
            }else{
                n = sum;
            }
        }
        return false;
    }
}