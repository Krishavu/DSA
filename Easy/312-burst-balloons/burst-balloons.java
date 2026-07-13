class Solution {
    public int f(int i, int j, ArrayList<Integer> arr, int [][]dp){
        if(i>j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int maxi=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=arr.get(i-1)*arr.get(ind)*arr.get(j+1) + f(i,ind-1,arr, dp) + f(ind+1,j, arr, dp);
            maxi=Math.max(cost, maxi);
        }
        return dp[i][j]=maxi;
    }
    public int maxCoins(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [][]dp = new int[nums.length+1][nums.length+1];
        for( int[] rows: dp){
            Arrays.fill(rows,-1);
        }
        arr.add(1);
        for(int i=0;i<nums.length;i++) arr.add(nums[i]);
        arr.add(1);
        return f(1, nums.length, arr, dp);
    }
}