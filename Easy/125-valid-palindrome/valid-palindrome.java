class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","");
        // s=s.replace(",","");
        // s=s.replace(":","");
        s=s.replaceAll("[^A-Za-z0-9\s]", "");
        s=s.toLowerCase();
        System.out.print(s);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String t=sb.toString();
        return s.equals(t);
    }
}