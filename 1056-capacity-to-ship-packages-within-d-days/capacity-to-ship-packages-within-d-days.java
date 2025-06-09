class Solution {
    public int shipWithinDays(int[] w, int days) {
        int n = w.length;
        int low = maxi(w);
        int high = sum(w);

        while(low<=high){
            int mid = (low+high)/2;

            int daysreq = method(w, mid);
            if(daysreq <= days){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static int maxi(int[] w){
        int mini = Integer.MIN_VALUE;
        for(int i : w){
            mini = Math.max(mini, i);
        }
        return mini;
    }

    public static int sum(int[] w){
       
        int maxi = 0;
        for(int i : w){
            maxi+=i;
        }
        return maxi;
    }


    public static int method(int [] w , int mid){
        int day =1;
        int load =0;
        for(int i =0; i<w.length;i++){
            if(load+w[i] <= mid){
                load+=w[i];
            }
            else{
                day=day+1;
                load=w[i];
            }
        }
        return day;
    }
}