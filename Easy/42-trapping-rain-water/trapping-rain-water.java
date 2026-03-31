class Solution {
    public int trap(int[] height) {
        int lmaxi[] = new int[height.length];
        lmaxi[0]=height[0];
        for(int i=1;i<height.length;i++){
            lmaxi[i]=Math.max(lmaxi[i-1],height[i]);
        }
        int rmaxi[] = new int[height.length];
        rmaxi[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rmaxi[i]=Math.max(rmaxi[i+1],height[i]);
        }
        int res=0;
        for(int i=0;i<height.length;i++){
            res+=Math.min(lmaxi[i],rmaxi[i])-height[i];
        }
        return res;
    }
}