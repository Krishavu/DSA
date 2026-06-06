class Solution {
    public void swapp(int nums[], int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public void sortColors(int[] arr) {
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swapp(arr, low, mid);
                mid++; low++;
            }else if(arr[mid]==1){
                mid++;
            }
            else{
                swapp(arr, mid, high);
                high--;
            }
        }
    }
}