class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        while(i<n){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i++];
            maxi=Math.max(maxi,sum);
        }
        return maxi;
    }
}