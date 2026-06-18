class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(target==sum){
                        ArrayList<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        arr.add(temp);
                        k++; l--;
                        while(k<nums.length && nums[k]==nums[k-1]) k++;
                        while(k<nums.length && nums[l]==nums[l+1]) l--;
                    }else if( target< sum) l--;
                    else k++;
                }
            }
        }
        return arr;
    }
}