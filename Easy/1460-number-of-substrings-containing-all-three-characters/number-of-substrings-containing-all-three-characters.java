class Solution {
    public int numberOfSubstrings(String s) {
        int cnt=0;
        int []ss= new int[3];
        Arrays.fill(ss,-1);
        for(int i=0;i<s.length();i++){
            ss[s.charAt(i)-'a']=i;
            cnt+= 1 + Math.min(Math.min(ss[0],ss[1]),ss[2]);
        }
        return cnt;
    }
}