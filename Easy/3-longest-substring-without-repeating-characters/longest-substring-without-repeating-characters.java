class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
            for(int j=i;j<s.length();j++){
                if(hash.containsKey(s.charAt(j))) break;
                int len=j-i+1;
                maxL=Math.max(maxL,len);
                hash.put(s.charAt(j),1);
            }
        }
        return maxL;
    }
}