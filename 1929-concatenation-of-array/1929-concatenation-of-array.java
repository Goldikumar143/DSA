class Solution {
    public int[] getConcatenation(int[] nums) {
        // nums=new int[nums.length];
        int len=nums.length;
        int j=0;
        nums = (int[])resizeArray(nums, nums.length+nums.length);
       for(int i=len;i<nums.length;i++){
           
           nums[i]=nums[j];
           j++;
            System.out.print(j);
       }
        System.out.print(Arrays.toString(nums));
        System.out.print(nums.length);
        
        
        return nums;
    }
    
    private static Object resizeArray (Object oldArray, int newSize) {
            int oldSize = java.lang.reflect.Array.getLength(oldArray);
            Class elementType = oldArray.getClass().getComponentType();
            Object newArray = java.lang.reflect.Array.newInstance(elementType, newSize);
            int preserveLength = Math.min(oldSize, newSize);
               if (preserveLength > 0)
                  System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
            return newArray;
      }
}