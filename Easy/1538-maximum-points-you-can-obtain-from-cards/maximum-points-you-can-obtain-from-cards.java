class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int lsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int rsum=0;
        int msum=0;
        int n=cardPoints.length;
        int ri=n-1;
        int li=k-1;
        while(lsum!=0){
            int sum=lsum+rsum;
            msum=Math.max(msum,sum);
            lsum-=cardPoints[li--];
            rsum+=cardPoints[ri--];
        }
        int sum=lsum+rsum;
        msum=Math.max(msum,sum);
        return msum;

    }
}