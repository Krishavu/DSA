class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res= new ArrayList<>();
        int el1=0; int cnt1=0;
        int el2=0; int cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;
                el2=nums[i];
            }else if(el1==nums[i]){
                cnt1++;
            }else if(el2==nums[i]){
                cnt2++;
            }else{
                cnt1--;cnt2--;
            }
        }
        int cntf1=0; int cntf2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]) cntf1++;
            else if(el2==nums[i]) cntf2++;
        }
        if(cntf1>nums.length/3) res.add(el1);
        if(cntf2>nums.length/3) res.add(el2);

        return res;
    }
}