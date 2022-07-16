class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List  ans = new ArrayList <>();
        int j =0; 
        
        Arrays.sort(nums);
        for (int i =1 ; i< nums.length ; i++){
            
            if (nums[j] == nums[i]){
               
                j++;
                ans.add(nums[i]);
                
            }
            else{
               
                j++;
                
            }
        }
        return ans;   
    }
    
    
    }
