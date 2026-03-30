class Solution {
    public int rob(int[] nums) {
        int money[]= new int[nums.length];
        if(nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0],nums[1]);
        money[0]=nums[0];
        money[1]=Math.max(nums[0],nums[1]);
        money[2]=Math.max(nums[0]+nums[2],nums[1]);
        for(int i=3;i<nums.length;i++){
            money[i]=nums[i]+Math.max(money[i-2],money[i-3]);
        }
        return Math.max(money[nums.length-1],money[nums.length-2]);
    }
}