class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int minl=Integer.MAX_VALUE;
        int m=t.length();
        int n=s.length();
        int hash[]= new int[256];
        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }
        int req=m;
        int sindex=-1;
        while(r<n){
            if(hash[s.charAt(r)]>0){
                req--;
            }
            hash[s.charAt(r)]--;
            while(req==0){
                if(r-l+1<minl){
                    minl=r-l+1;
                    sindex=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    req+=1;
                }
                l++;
            }
            r++;
        }
        if(sindex==-1) return "";
        return s.substring(sindex, sindex+minl);
    }
}