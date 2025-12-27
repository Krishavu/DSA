class Solution {
    public int divide(int dividend, int divisor) {
        Boolean sign=true;
        if(dividend >0 && divisor<=0) sign= false;
        if(dividend<=0 && divisor>0) sign= false;
        if(dividend==Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int ans=0;
        while(n>=d){
            int cnt=0;
            while(d<<(cnt+1)<=n){
                cnt++;
            }
            ans+=1<<cnt;
            n=n-(d<<cnt);
        }

        if(sign==true && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign==false && ans>Integer.MAX_VALUE) return Integer.MIN_VALUE;
        // if(sign==false) return -ans;
        return sign ? ans : -ans;
    }
}