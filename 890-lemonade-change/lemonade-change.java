class Solution {
    public boolean lemonadeChange(int[] b) {
        int five =0, ten =0;

        for(int i=0;i< b.length;i++){
            if(b[i]==5) five++;
            else if(b[i]==10){
                if(five>0) {
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five>0 && ten >0){
                    five--;
                    ten--;
                }
                else if(five>2){
                    five -= 3;
                }
                else return false;
            }
        }
        return true;
    }
}