class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i=0;
        int f=0,ten=0,t=0;
        while(i<bills.length){
            if(bills[i]==5){
                f++;
            }
            else if(bills[i]==10){
                if(f>0){
                    ten++;
                    f--;
                }else return false;
            }
            else{
                if(f>0 && ten >0){
                    t++;
                    f--;
                    ten--;
                }else if(f>2){
                    t++;
                    f-=3;
                }
                else return false;
            }
            i++;
        }
        // if(f<0 || ten<0 || t<0) return false;
        return true;
    }
}