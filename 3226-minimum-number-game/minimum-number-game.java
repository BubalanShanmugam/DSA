class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int k =0;
        int i =0;
        int j = 1;

        while(i<nums.length&& j< nums.length){
            result[k++]=nums[j];
            
            result[k++]=nums[i];

            i=i+2;
            j+=2;

        }
        return result;
    }
}