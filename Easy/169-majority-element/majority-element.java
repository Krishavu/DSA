class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int el=nums[0];
        for(int i=1;i<nums.length;i++){
            if(el==nums[i]) cnt++;
            else{
                if(cnt>0) cnt--;
                else{
                    el=nums[i];
                }
            }
        }
        int cnt1=0;
        for(int i=0;i<nums.length;i++){
            if(el==nums[i]) cnt1++;
        }
        if(cnt1>nums.length/2) return el;
        return 0;
    }
}