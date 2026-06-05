class Solution {
    public void reverse(int arr[], int start, int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public void swapp(int arr[], int idx,int i){
        int temp=arr[idx];
        arr[idx]=arr[i];
        arr[i]=temp;
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,n-1);
        }else{
            for(int i = n-1;i>=0;i--){
                if(nums[idx]<nums[i]){
                    swapp(nums, idx,i);
                    break;
                }
            }
            reverse(nums,idx+1,n-1);
        }
    }
}