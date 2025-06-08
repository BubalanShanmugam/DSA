class Solution {
    public void moveZeroes(int[] arr) {
    //     for(int i =0; i < nums.length; i++){
    //         if(nums[i] == 0){
    //             int n = nonzero(arr, i);
    //             arr[i]==arr[n];
    //         }
    //     }
    // }

    // public static int nonzero(int arr[], int j){
    //     for(int i =j+1;i < arr.length;i++){
    //         if(arr[i] != 0){
    //             return i;
    //         }
    //     }


    // ----------------------------------------


        // int[] array = new int[arr.length];
        // int j =0;
        // for(int i = 0; i < arr.length;i++){
        //     if(arr[i]!=0){
        //         array[j]= arr[i];
        //         j++;
        //     }
        // }
        // for(int i =0;i< arr.length;i++){
        //         arr[i]=array[i];
        // }  

        // ----------------------------------

        int j =0;
        for(int i =0; i< arr.length;i++){
            if(arr[i]!=0){
                if(j !=i){
                    arr[j]=arr[i];
                    arr[i]=0;
                }
                j++;
            }
        }  
    }
}