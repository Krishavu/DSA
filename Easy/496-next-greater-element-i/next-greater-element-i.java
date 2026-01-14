class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int j=0;
        int arr[] = new int[nums1.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int k=j+1;
                    while(k<nums2.length){
                        if(nums2[k]>nums1[i]){
                            arr[i]=nums2[k];
                            break;
                        }
                        k++;
                    }
                    break;
                }
            }
        }
        return arr;
    }
}