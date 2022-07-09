class Solution {
    public String restoreString(String s, int[] indices) {
         char[] Ch=new char[s.length()];
    for(int i=0;i<s.length();i++){
            Ch[indices[i]]=s.charAt(i);
     }
           String s2=new String(Ch);
	
        return s2;
    }
}