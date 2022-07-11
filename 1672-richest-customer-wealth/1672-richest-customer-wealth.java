class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                count+=accounts[i][j];
               
            }
             list.add(count);
                  System.out.print(list);
        }
       Collections.sort(list); 
      
    return list.get(list.size()-1);
        
        }
    
}