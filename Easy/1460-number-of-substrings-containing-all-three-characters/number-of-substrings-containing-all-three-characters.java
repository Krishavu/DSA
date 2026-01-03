class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        int hash[]= new int[3];
        hash[0]=hash[1]=hash[2]=-1;
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
            cnt=cnt+ 1 + Math.min(Math.min(hash[0],hash[1]),hash[2]);
        }
        return cnt;

    }
}