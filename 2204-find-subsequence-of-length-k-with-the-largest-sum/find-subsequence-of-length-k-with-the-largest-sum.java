// class Solution {
//     public int[] maxSubsequence(int[] nums, int k) {
//         if(nums.length == k) return nums;
//         // int [] result = Arrays.copyOfRange(nums,nums.length-k,nums.length)
//         // int j=k-1;

//         Arrays.sort(nums);
//         // for(int i=nums.length-1;i>=nums.length-k;i--){
//         //         result[j--]=nums[i];
//         // }
//         return Arrays.copyOfRange(nums,nums.length-k,nums.length);
//     }
// }

// class Solution {
//     public int[] maxSubsequence(int[] nums, int k) {
//         int sum =0;
//         int maxsum = 0;
//         int[] res = new int[k];
//         int j=0;
//         for(int i=0;i<nums.length && k>=0 ;i++){
//             sum+=nums[i];
//             int temp = sum;
//             if(sum > maxsum || temp < sum ){
//                 maxsum = sum;
//                 res[j++]=nums[i];
//                 k--;
//             }
        
//         }
//         return res;
//     }
// }


// class Solution {
//     public int[] maxSubsequence(int[] nums, int k) {
//         
//         int j=0;
//         int [] res= new int[k];
//         int max = nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(max < nums[i]){

//             }
//         }
//     }
// }

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

         if(nums.length == k) return nums;

            int[][] mat = new int[nums.length][2];

            for(int i=0; i<nums.length; i++){
                mat[i][0]= nums[i];          
                mat[i][1]=i;
            }

            Arrays.sort(mat, (a,b)->
               {
                return Integer.compare(b[0],a[0]);
               }
            );

            Arrays.sort(mat,0,k, (a,b)->
               {
                return Integer.compare(a[1],b[1]);
               }
            );


            int [] res = new int[k];
            for(int i=0;i<k;i++){
                res[i] = mat[i][0];
            }
            return res;
    }
}