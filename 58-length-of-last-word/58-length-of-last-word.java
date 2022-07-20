class Solution {
    public int lengthOfLastWord(String s) {
        char[] temp = s.toCharArray();
        int ans=0;
        int t=0;
            for(int i = temp.length-1; i>=0;i--){
                if(temp[i]!=' '){
                    ans++;
                }
                else if (temp[i]==' ' && ans==0){
                    t++;
                }
                else if(temp[i]==' ' && ans>0){
                    break;
                }
            }
        ans = ans+t;
        return ans -t;
    }
}