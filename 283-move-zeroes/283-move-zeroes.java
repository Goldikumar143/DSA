class Solution {
    public void moveZeroes(int[] nums) {
        
        int lastNonZero = -1;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[++lastNonZero] = nums[i];
                if (lastNonZero != i) nums[i] = 0;
            }
        }
    }
}