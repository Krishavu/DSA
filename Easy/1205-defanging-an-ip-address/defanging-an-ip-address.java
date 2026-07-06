class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb= new StringBuilder(address);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='.'){
                sb.deleteCharAt(i);
                sb.insert(i,"[.]");
                i+=2;
            }
        }
        return sb.toString();
    }
}