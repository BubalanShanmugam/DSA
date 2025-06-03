class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low =0;

         int max = Integer.MIN_VALUE;
         for(int i : piles){
            max = Math.max(max, i);
         }
         int high= max ;

        while(low<=high){
            int mid =(low+high)/2;
            
            int totalhours = method(piles, mid);

            if(totalhours <= h){
                high= mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return low;
    }

    public static int method(int[] arr , int mid){
        int total =0;

        for(int i=0;i< arr.length;i++){
            total += Math.ceil((double) arr[i]/ (double) mid);
        }
        return total;
    }
}