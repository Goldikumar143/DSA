// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
          int count =1;
        int majority = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(majority == nums[i]) count++;   
            else count -=1;
            if(count == 0)
            {
                majority = nums[i];
                count =1;
            }
            
        }
        count=0;
        for(int i=0;i<size;i++){
            if(majority==nums[i]){
                count++;
            }
            if(count>size/2){
               return majority; 
            }
        }
        
        return -1;
    }
}