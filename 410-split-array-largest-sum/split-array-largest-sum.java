class Solution {
    public int splitArray(int[] nums, int k) {
        int low = maxi(nums);
        int high = sum(nums);

        while(low<=high){
            int mid = (low+high)/2;

            int count = possible(nums,k,mid);

            if(count<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static int maxi(int[] arr){
        int max =Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum =0;
        for(int i:arr){
            sum +=i;
        }
        return sum;
    }

    public static int possible(int[] arr, int k, int mid){
        int count=1;
        int sum =0;

        for(int i =0; i<arr.length;i++){
            if(sum+arr[i] <=mid){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
                count++;
            }
        }
        return count;
    }
}