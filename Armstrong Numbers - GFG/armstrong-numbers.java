// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        
          // code here
          int count=0;
          int k=n;
        while(n!=0){
          int j=n%10;
           n=n/10;
       count+=(j*j*j);
      }
     
     
        if(count==k)return "Yes";
        
        return "No";
    }
}