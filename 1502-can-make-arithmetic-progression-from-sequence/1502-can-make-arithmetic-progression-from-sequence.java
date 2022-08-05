class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[0]-arr[1];
       // boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            if(d != arr[i]-arr[i+1]){
                return false;
            }
        }
        return true;
    }
}