class Solution {
    public String defangIPaddr(String address) {
        
     String defanged = new String();
        
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defanged = defanged + "[.]";
            } else {
                defanged = defanged +address.charAt(i);
            }
        }
        
        return defanged;
    }
}