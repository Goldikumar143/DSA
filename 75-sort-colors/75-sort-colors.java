class Solution {
    public void sortColors(int[] nums) {
         int n = nums.length;  
        int i, j, temp;  
        for (i = 0; i < n; i++)  
        {  
            for (j = i + 1; j < n; j++)  
            {  
                if (nums[j] < nums[i])  
                {  
                    temp = nums[i];  
                    nums[i] = nums[j];  
                    nums[j] = temp;  
                }  
            }  
        }  
        
    }
}