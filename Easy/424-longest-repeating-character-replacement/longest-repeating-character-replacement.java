class Solution {
    public int characterReplacement(String s, int k) {
        int maxl=0;
        int maxf=0;
        int l=0; int r=0;
        HashMap <Character,Integer> mpp = new HashMap<>();
        while(r<s.length()){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,mpp.get(s.charAt(r)));

            if((r-l+1-maxf)<=k){
                maxl=Math.max(maxl,r-l+1);
            }else{
                char p=s.charAt(l);
                mpp.put(s.charAt(l),mpp.get(p)-1);
                if(mpp.get(p)==0) mpp.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return maxl;
    }
}