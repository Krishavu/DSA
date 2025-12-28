class Solution {
    public int minBitFlips(int strt, int go) {
        int ns=strt^go;
        int nt=0;
        while(ns>0){
            if((ns & (1))!=0){
                nt++;
            }
            ns=ns>>1;
        }
        return nt;

    }
}