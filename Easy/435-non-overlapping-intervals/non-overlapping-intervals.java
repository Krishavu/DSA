class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // List<int[]> temp = new ArrayList<>();
        // for(int i=0;i<intervals.length;i++){
        //     temp.add(new int[]{intervals[i][0], intervals[i][1]});
        // }
        // temp.sort(Comparator.comparingInt(a-> a[1]));
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int freetime=intervals[0][0]; int cnt=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=freetime){
                freetime=intervals[i][1];
            }else cnt++;
        }
        return cnt;
    }
}