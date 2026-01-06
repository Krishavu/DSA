class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxl=0; int l=0; int r=0; int zeros=0;
        while(r<nums.length){
            if(nums[r]==0) zeros++;
            if(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}