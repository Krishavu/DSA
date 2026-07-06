class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1= new StringBuilder("");
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        System.out.println(sb1);
        String str1=String.valueOf(sb1);

        StringBuilder sb2= new StringBuilder("");
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        System.out.println(sb2);
        return str1.contentEquals(sb2);
    }
}