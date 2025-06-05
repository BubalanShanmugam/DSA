class Solution {
    public int minDays(int[] arr, int m, int k) {
        
        if(arr.length < (long)m*(long)k) return -1;

        int low =mini(arr);
        int high = maxi(arr);

        while(low<=high){
            int mid = (low+high)/2;

            if(possible(arr, mid, m ,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    int mini(int[] arr){
        int mini = Integer.MAX_VALUE;
        for(int i: arr){
                mini= Math.min(mini, i);
        }
        return mini;
    }

    int maxi(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i: arr){
                maxi= Math.max(maxi, i);
        }
        return maxi;
    }


    boolean possible(int [] arr,int mid,int m ,int k){
            int count =0;
            int noofbouquets=0;

            for(int i=0; i<arr.length;i++){
                if(arr[i]<=mid){
                    count++;
                }
                else{
                    noofbouquets+=(count/k);
                    count=0;
                }
            }
            noofbouquets+=(count/k);
            if(noofbouquets>=m) return true;
            else return false;
    }

}