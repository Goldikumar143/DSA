class Solution {
    public String longestCommonPrefix(String[] strs) {
         int i,j,res=strs[0].length(),len=strs.length;
        for(i=1;i<len;i++){
            for(j=0;j<strs[i].length() && j<res && strs[0].charAt(j)==strs[i].charAt(j);j++);
            res=j;
        }
        return strs[0].substring(0,res);
    }
}