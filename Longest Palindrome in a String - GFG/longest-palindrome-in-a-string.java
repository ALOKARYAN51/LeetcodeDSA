// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        while(low<=high){
            char c1 = str.charAt(low);
            char c2 = str.charAt(high);
            if(c1==c2){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
    static String longestPalin(String S){
        // code here
        String ans ="";
        int len = S.length();
        for(int i = 0; i <= len; i++){
            for(int j = i+1; j<= len; j++){
                boolean val = isPalindrome(S.substring(i,j));
                if(val){
                    String string = S.substring(i,j);
                    if(string.length()> ans.length()){
                        ans = string;
                    }
                }
            }
            
        }
        return ans;
    }
}