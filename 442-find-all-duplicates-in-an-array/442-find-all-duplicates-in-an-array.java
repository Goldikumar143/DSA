class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> li = new ArrayList<>();
        cycleSort(nums);
        System.out.print(Arrays.toString(nums));
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i + 1){
                li.add(nums[i]);
            }
        }
        return li;
        
    }
    
    static void cycleSort(int[] nums){
        int i = 0;
         while(i < nums.length){
             int curr = nums[i] -1;
             if(nums[i] != nums[curr]){
                 swap(nums, i, curr);
             }else{
                 i++;
             }
         } 
    }
    
    static void swap(int[] nums , int f , int l){
        int temp = nums[f];
        nums[f] = nums[l];
        nums[l] = temp;
    }
    
    }
