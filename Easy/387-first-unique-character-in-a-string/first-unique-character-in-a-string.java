class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character element=s.charAt(i);
            mp.put(element, mp.getOrDefault(element, 0) + 1);
        }
        for (int i=0;i<s.length();i++) {
            if(mp.get(s.charAt(i))==1){
                return s.indexOf(s.charAt(i));
            }
        }
        return -1;
    }
}