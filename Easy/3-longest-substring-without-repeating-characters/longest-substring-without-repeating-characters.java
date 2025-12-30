class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL=0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        while(r<s.length()){
            if(hash.containsKey(s.charAt(r))){
                hash.clear();
                l++;
                r=l;
            }
            int len=r-l+1;
            maxL=Math.max(maxL,len);
            hash.put(s.charAt(r),1);
            r++;
        }
        return maxL;
    }
}