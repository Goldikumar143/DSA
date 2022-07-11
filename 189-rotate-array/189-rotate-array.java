class Solution {
    public void rotate(int[] nums, int k) {
       List<Integer> list=new ArrayList<Integer>(nums.length);
       
       
       
        
//         int len3=nums.length;
       
       
       
        
// //         for(int i=0;i<len;i++){
// //          list.add(nums[l+i]);
           
// //             System.out.print(list);
        
// //         }
// //          for(int i=0;i<l;i++){
// //           list.add(nums[i]);
// //           //  System.out.print(list);
        
// //         }
        
//         for(int i=0;i<nums.length;i++){

//         int j=(i+k)%len3;
//              int len=k%nums.length;
//             // System.out.print(len);
       
          
//           System.out.print(j);
//             list.add( j,  nums[i]);
//         }
        
//          for(int i=0;i<list.size();i++){
//               nums[i]=list.get(i);
        
//         }
        
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[(i+k)%n]=nums[i];
        }
         for(int i=0;i<n;i++){
             nums[i]=res[i];
 }
       
      
    }
}