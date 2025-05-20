// class Solution {
//     public int subarraySum(int[] a, int k) {

//         int n = a.length;

//         Map<Integer, Integer> preSumMap = new HashMap<>();
        
//         int sum = 0;
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             sum += a[i];

//             if (sum == k) {
//                 maxLen = Math.max(maxLen, i + 1);
//             }

//             int rem = sum - k;

//             if (preSumMap.containsKey(rem)) {
//                 int len = i - preSumMap.get(rem);
//                 maxLen = Math.max(maxLen, len);
//             }

//             if (!preSumMap.containsKey(sum)) {
//                 preSumMap.put(sum, i);
//             }
//         }
        
//         return maxLen;
//     }
// }

// class Solution {
//     public int subarraySum(int[] arr, int k) {
//         // code here
//         int fullsum =0;
//         int maxcount=0;
        
//         for(int i : arr){
//             fullsum += i;
//         }
        
//         if(fullsum !=k)
//         {
//         for(int i =0;i< arr.length;i++){
//             int count =0;
//             int sum =0;
//             for(int j =i; j< arr.length;j++){
//                 sum+=arr[j];
//                 if(sum <= k){
//                     count++;
//                 }
//                 else{
//                     if(maxcount<count){
//                     maxcount = count;
//                     }
//                     break;
//                 }
//             }
//           }
//         }
//         else{
//             return arr.length;
//         }

//         return maxcount;
//     }
// }


public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
      
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
      
        for (int start = 0; start < sum.length; start++) {
            for (int end = start + 1; end < sum.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
      
        return count;
    }
}