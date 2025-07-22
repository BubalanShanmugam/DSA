// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int sum =0;
//         for(int i : nums){
//             set.add(i);
//         }

//         for(int i: set){
//             sum+= i;
//         }
//         return sum;
//     }
// }




class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int j =0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        int [] hash = new int[10001];
        int sum =0;
        int max =0;

        for(int i=0;i< nums.length;i++){
            
            while(hash[nums[i]]==1){
                sum -= nums[j];
                hash[nums[j]]=0;
                j++;
            }

            sum += nums[i];
            hash[nums[i]]=1;
            max = (sum>max)?sum:max;
        }
        return max;
    }
}