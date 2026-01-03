class Solution {
    public int characterReplacement(String s, int k) {
        int maxl=0;
        int maxf=0;
        int l=0; int r=0;
        HashMap <Character,Integer> mpp = new HashMap<>();
        while(r<s.length()){
            if(!mpp.containsKey(s.charAt(r))){
                mpp.put(s.charAt(r),1);
            }else{
            char p=s.charAt(r);
                mpp.put(s.charAt(r),mpp.get(p)+1);
            }
            maxf=Math.max(maxf,mpp.get(s.charAt(r)));

            if((r-l+1-maxf)<=k){
                maxl=Math.max(maxl,r-l+1);
            }else{
                char p=s.charAt(l);
                if(mpp.get(s.charAt(l))==1) mpp.remove(s.charAt(l));
                else mpp.put(s.charAt(l),mpp.get(p)-1);
                l++;
            }
            r++;
        }
        return maxl;
    }
}