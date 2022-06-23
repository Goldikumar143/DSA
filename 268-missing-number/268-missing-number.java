class Solution {
    public int missingNumber(int[] nums) {
     int sumarr=0,i=0;
        int n=nums.length;
        int sum=n*(n+1)/2;
        while(i<n){            
            sumarr+=nums[i];
            i++;
        }
        return (sum-sumarr);
    }
}