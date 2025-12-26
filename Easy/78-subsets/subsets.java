class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> ans= new ArrayList<List<Integer>>();
        int subset=1<<nums.length;
        for(int i=0;i<subset;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    l.add(nums[j]);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}