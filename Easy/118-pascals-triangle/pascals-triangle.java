class Solution {
    public List<Integer> pascal(int n){
        List<Integer> temp = new ArrayList<>();
        if(n<=2){
            for(int i=0;i<n;i++) temp.add(1);
            return temp;
        }

        long res=1;
        temp.add(1);
        for(int i=1;i<n-1;i++){
            res=res*(n-i);
            res=res/i;
            temp.add((int)res);
        }
        temp.add(1);
        return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> a = pascal(i);
            result.add(new ArrayList<>(a));
        }
        return result;
    }
}