class Solution {
    public int characterReplacement(String s, int k) {
        int maxl=0;
        int maxf=0;
        int l=0; int r=0;
        int[] hsh= new int[26];
        while(r<s.length()){
            hsh[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hsh[s.charAt(r)-'A']);

            if((r-l+1-maxf)<=k){
                maxl=Math.max(maxl,r-l+1);
            }else{
                hsh[s.charAt(l)-'A']--;
                // if(mpp.get(p)==0) mpp.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return maxl;
    }
}