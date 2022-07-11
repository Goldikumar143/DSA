class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
           
            num[j]=nums[i];
            j++;
           num[j]=nums[n+i];
             j++;
        }
        return num;
    }
}