class Solution {
    public int jump(int[] nums) {
        int l=0,r=0;
        int cnt=0;
        while(r<nums.length-1){
            int maxi=Integer.MIN_VALUE;
            for(int j=l;j<=r;j++){
                maxi=Math.max(j+nums[j],maxi);
            }
            l=r+1;
            r=maxi;
            cnt++;
        }
        return cnt;
    }
}