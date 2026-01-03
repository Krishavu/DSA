class Solution {
    public int help(int[] nums, int k) {
        int cnt=0;
        int tcnt=0;
        int l=0; int r =0;
        while(r<nums.length){
            if((nums[r]&1)==1) tcnt+=1;
            while(tcnt>k){
                if((nums[l]&1)==1){
                    tcnt-=1;
                }
                l++;
            }
            cnt+= r-l+1;
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k){
        return help(nums,k)-help(nums,k-1);
    }
}