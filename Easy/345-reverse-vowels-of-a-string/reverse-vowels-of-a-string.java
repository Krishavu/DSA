class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        HashSet<Character> hs = new HashSet<>();
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        char arr[]= s.toCharArray();
        while(i<j){
            if(hs.contains(arr[i]) && hs.contains(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(hs.contains(arr[i])){
                j--;
            }
            else if(hs.contains(arr[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}