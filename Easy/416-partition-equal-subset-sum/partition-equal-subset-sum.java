class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        int n=nums.length;
        boolean dp[][]= new boolean[n][target+1];
        // Arrays.fill(dp,false);
        for(int i=0;i<n;i++) dp[i][0]=true;
        if(nums[0]==target)dp[0][nums[0]]=true;
        for(int ind=1;ind<n;ind++){
            for(int k=1;k<=target;k++){
                boolean nottake=dp[ind-1][k];
                boolean take=false;
                if(nums[ind]<=k) take=dp[ind-1][k-nums[ind]];
                dp[ind][k]=take || nottake;
            }
        }
        return dp[n-1][target];

    }
}