class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxl=0;
        int len=0;
        int l=0;
        int r=0;
        int zeros=0;
        while(r<nums.length){
            if(nums[r]==0) zeros++;
            while(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            len=r-l+1;
            maxl=Math.max(len,maxl);
            r++;
        }
        return maxl;
    }
}

