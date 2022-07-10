class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        int count=0;
        ans=rec(nums,ans,count);
        return ans;
        
    }
    public int[] rec(int[] nums,int[] ans,int count){
        if(count!=nums.length){
            
            ans[count]=nums[nums[count]];
            
           System.out.print(count);
            rec(nums,ans,count+1);
             
        }
        return ans;
    }
}