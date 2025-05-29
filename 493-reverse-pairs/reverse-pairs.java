class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length-1);
    }


    public int mergesort(int [] arr, int low, int high){
        int count=0;
        if(low>=high) return count;

        int mid = (low+high )/2;

        count+= mergesort(arr, low, mid);
        count+= mergesort(arr, mid+1, high);
        count+= paireverse(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }


    public int paireverse(int[] arr, int low, int mid, int high){
        int  count=0;
        int j = mid+1;

        for(int i =low;i<= mid;i++){
            while(j<= high && arr[i]> 2L*arr[j]) j++;
            count+=(j-(mid+1));
        }
        return count;
    }


    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();

        int left= low; int right= mid+1;

        while(left<=mid && right <=high){
            if(arr[left] < arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i=low; i<= high;i++){
            arr[i]=list.get(i-low);
        }
    }
}