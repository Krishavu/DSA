class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // for(int i=nums.length-1;i>=0;i--){

        // }
        int arr[]= new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            int j=(i+1)%nums.length;
            while(j!=i){
                if(nums[i]<nums[j]){
                    arr[i]=nums[j];
                    break;
                }
                j=(j+1)%nums.length;
            }
        }
        return arr;

    }
}