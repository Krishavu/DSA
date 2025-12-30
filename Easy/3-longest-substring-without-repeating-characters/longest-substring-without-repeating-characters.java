class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL=0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        while(r<s.length()){
            while(hash.containsKey(s.charAt(r))){
                hash.remove(s.charAt(l++));
            }
            hash.put(s.charAt(r),1);
            maxL=Math.max(maxL,r-l+1);
            r++;
        }
        return maxL;
    }
}