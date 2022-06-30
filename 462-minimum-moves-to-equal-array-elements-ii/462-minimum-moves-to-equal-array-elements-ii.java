class Solution {
    public int minMoves2(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int l=nums.length;
        int mid=l/2;
        for(int i=0;i<l;i++){
            if(l==1){
            return count;
            }
           else{
            
              count+=Math.abs(nums[mid]-nums[i]);
              
            
           }     
          
        }
        return count;
    }
}